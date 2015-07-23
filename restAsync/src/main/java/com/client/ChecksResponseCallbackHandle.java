package com.client;

import javax.ws.rs.client.InvocationCallback;


public class ChecksResponseCallbackHandle implements InvocationCallback<Boolean> {
    @Override
    public void completed(Boolean response) {
        System.out.println("Success: " + response);
    }

    @Override
    public void failed(Throwable e) {

        e.printStackTrace();
    }
}
