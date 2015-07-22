package com.client;

import com.server.jaxrs.Patient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Shubo on 7/21/2015.
 */
public class PatientServiceClient {

    private static final String PATIENT_SERVICE_URL = "http://localhost:18080/services/patientservice";
    public static void main(String[] args) {
        /*
        * Testing GET method
        * */
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id", 123);
        Patient patient = target.request().get(Patient.class);
        System.out.println("Get method: " + patient.getName());

        /*
        * Testing PUT method
        * */
        WebTarget putTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
        patient.setName("Vince");
        Response updateResponse = putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
        System.out.println("Put method: " + updateResponse.getStatus());
        updateResponse.close();

        /*
        * Testing POST method
        * */
        Patient newPatient = new Patient();
        newPatient.setName("Dick");
        WebTarget postTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
        Patient postResponse = postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML), Patient.class);
        System.out.println("Post method: " + postResponse.getId() + " " + postResponse.getName());


        /*
        * Testing DELETE method
        * */
        WebTarget deleteTarget = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id", 124);
        Response deleteResponse = deleteTarget.request().delete();
        System.out.println("Delete method: " + deleteResponse.getStatus());

        client.close();
    }
}
