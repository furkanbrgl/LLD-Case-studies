package Flight_Booking.Entity;

import Flight_Booking.Enums.ScheduleStatus;

import java.util.List;

public class FlightSchedule {

    Flight flight;
    Airport start;
    Airport destination;
    long startTime;
    long endTime;
    ScheduleStatus scheduleStatus;
    List<FlightSeat> flightSeats;
}
