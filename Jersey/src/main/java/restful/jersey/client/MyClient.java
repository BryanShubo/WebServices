package restful.jersey.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;


public class MyClient {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        String result = client.target("http://localhost:18080/webapi/messages").request().get(String.class);
        System.out.println(result);
    }
}
