package client;

import com.cdyne.ws.weatherws.*;
/*  These services are available
* <wsdl:service name="Weather">
        <wsdl:port name="WeatherSoap" binding="tns:WeatherSoap">
            <soap:address location="http://wsf.cdyne.com/WeatherWS/Weather.asmx"/>
        </wsdl:port>
        <wsdl:port name="WeatherSoap12" binding="tns:WeatherSoap12">
            <soap12:address location="http://wsf.cdyne.com/WeatherWS/Weather.asmx"/>
        </wsdl:port>
        <wsdl:port name="WeatherHttpGet" binding="tns:WeatherHttpGet">
            <http:address location="http://wsf.cdyne.com/WeatherWS/Weather.asmx"/>
        </wsdl:port>
        <wsdl:port name="WeatherHttpPost" binding="tns:WeatherHttpPost">
            <http:address location="http://wsf.cdyne.com/WeatherWS/Weather.asmx"/>
        </wsdl:port>
    </wsdl:service>
* */

public class WeatherClient {

    public static void main(String[] args) {
        /*
        * testing service="Weather", port="WeatherSoap"
        * */
        Weather weather = new Weather();
        WeatherSoap weatherSoap = weather.getWeatherSoap();
        WeatherReturn weatherReturn = weatherSoap.getCityWeatherByZIP("28212");
        System.out.println(weatherReturn.toString());
    }
}
