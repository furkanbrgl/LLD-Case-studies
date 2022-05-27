package Airline_Management.Entity.Flight;

import Airline_Management.Entity.Aircraft;
import Airline_Management.Entity.Seat.FlightSeat;
import Airline_Management.Enums.FlightStatus;

import java.util.Date;
import java.util.List;

public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;
    private Aircraft aircraft;
    List<FlightSeat> flightSeats;


    public boolean cancel() {
        return false;
    }

    public void updateStatus(FlightStatus status) {

    }
}
