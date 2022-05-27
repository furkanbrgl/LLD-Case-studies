package Airline_Management.Entity;

import Airline_Management.Actors.Passenger;
import Airline_Management.Entity.Flight.FlightInstance;
import Airline_Management.Entity.Seat.FlightSeat;
import Airline_Management.Enums.ReservationStatus;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class FlightReservation {
    private String reservationNumber;
    private FlightInstance flight;
    private Map<Passenger, FlightSeat> seatMap;
    private Date creationDate;
    private ReservationStatus status;

    public static FlightReservation fetchReservationDetails(String reservationNumber) {
        return null;
    }

    public List<Passenger> getPassengers() {
        return null;
    }
}
