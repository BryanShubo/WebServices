import com.bharatthippireddy.patient.Patient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by Shubo on 6/14/2015.
 */
public class JaxbMarshallerAndUnmarshaller {

    public static void main(String[] args){

        try {
            JAXBContext context = JAXBContext.newInstance(com.bharatthippireddy.patient.Patient.class);

            Marshaller marshaller = context.createMarshaller();

            Patient patient = new Patient();
            patient.setId(123);
            patient.setName("Bryan");

            StringWriter writer = new StringWriter();
            marshaller.marshal(patient,writer);

            System.out.println(writer.toString());


            // Unmarshaller process
            Unmarshaller unMarshaller = context.createUnmarshaller();
            Patient patientResult = (Patient)unMarshaller.unmarshal(new StringReader(writer.toString()));
            System.out.println(patientResult.getId() + " : " + patientResult.getName());
        } catch(Exception e) {

            e.printStackTrace();
        }



    }
}
