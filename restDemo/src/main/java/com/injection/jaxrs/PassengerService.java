package com.injection.jaxrs;

import com.injection.dto.Passenger;
import com.injection.dto.PassengerList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;

@Path("/Passenger")
@Produces("application/xml")
public class PassengerService {
    PassengerList passengerList = new PassengerList();

    public PassengerService() {
        init();
    }

    public void init(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        Passenger passenger = new Passenger();
        passenger.setName("Arron");
        passenger.setId(123);
        passengers.add(passenger);
        passengerList.setPassengers(passengers);
    }

    @GET
    public PassengerList getPassengers(int start, int size) {
        return passengerList;
    }

    @POST
    public void addPassenger(String name, int id) {

    }
}
