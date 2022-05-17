package Movie_Ticket_Booking.Movie;

import Hotel_Management.Data.Address;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String name;
    private int totalCinemaHalls;
    private Address address;

    private List<CinemaHall> halls;

    public Cinema(String name, Address address) {
        this.name = name;
        this.halls = new ArrayList<>();
        this.totalCinemaHalls = 0;
        this.address = address;
    }

    public void addHall(CinemaHall cinemaHall) {
        totalCinemaHalls++;
        halls.add(cinemaHall);
        return;
    }
}
