package Movie_Ticket_Booking.Actors;

import Movie_Ticket_Booking.Operations.Catalog;
import Movie_Ticket_Booking.Operations.Search;
import Movie_Ticket_Booking.Payment.Booking;

import java.util.List;

public class FrontDeskOfficer extends Person{

    Search search;

    public boolean makeBooking(Booking booking) {
        return true;
    }

    public List<Booking> getBooking() {
        return null;
    }

}
