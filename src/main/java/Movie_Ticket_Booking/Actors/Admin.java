package Movie_Ticket_Booking.Actors;

import Movie_Ticket_Booking.Movie.Movie;
import Movie_Ticket_Booking.Movie.Show;
import Movie_Ticket_Booking.Operations.Search;

public class Admin extends Person{

    Search search;

    public boolean addMovie(Movie movie) {
        return true;
    }

    public boolean addShow(Show show) {
        return true;
    }

    public boolean blockCustomer(Customer customer) {
        return true;
    }
}
