package Hotel_Management.Actors;

import Hotel_Management.Search.Search;
import Hotel_Management.ServicesAndBooking.RoomBooking;

import java.util.List;

public class Guest extends Person{

    private RoomBooking roomBooking;
    private Search search;

    public List<RoomBooking> getBookings() {
        return null;
    }

}
