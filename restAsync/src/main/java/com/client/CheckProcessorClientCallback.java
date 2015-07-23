package com.client;

import com.server.Check;
import com.server.ChecksList;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CheckProcessorClientCallback {
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:18080/services/checkservice/checks");

        AsyncInvoker asyncInvoker = target.request().async();

        ArrayList<Check> checks = new ArrayList<>();
        checks.add(new Check());
        ChecksList checksList = new ChecksList();
        checksList.setChecks(checks);
        Future<Boolean> future = asyncInvoker.post(Entity.entity(checksList, MediaType.APPLICATION_XML),
                                                   new ChecksResponseCallbackHandle());

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
