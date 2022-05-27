package Airline_Management.Entity;


import Airline_Management.Entity.Flight.FlightInstance;
import Airline_Management.Entity.Seat.Seat;

import java.util.List;

public class Aircraft {
    private String name;
    private String model;
    private int manufacturingYear;
    private List<Seat> seats;

    public List<FlightInstance> getFlights() {
        return null;
    }
}
