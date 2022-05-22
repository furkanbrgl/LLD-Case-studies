package Flight_Booking.Operations;

import Flight_Booking.Actors.User;
import Flight_Booking.Entity.BookingDetail;
import Flight_Booking.Entity.Flight;
import Flight_Booking.Entity.FlightSchedule;
import Flight_Booking.Entity.FlightSeat;

import javax.xml.stream.Location;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Booking {

    int no;
    List<User> users;
    FlightSchedule flight;
    Map<User, FlightSeat> seatMap;
    String satus;
    Date date;

    public void getFlightDetail_Search(Location start, Location end, Date date) {

    }

    public void bookingFlight(Flight flight, User user) {

    }

    public void confirmBooking(BookingDetail bookingDetails) {

    }
}
