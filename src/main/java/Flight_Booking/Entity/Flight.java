package Flight_Booking.Entity;

import java.util.List;

public class Flight {
    String flightNo;
    Airline company;
    int seatCapacity;
    List<Seat> seats;
    List<FlightSchedule> schedules;
}
