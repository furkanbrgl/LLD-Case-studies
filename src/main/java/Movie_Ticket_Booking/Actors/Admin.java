package Movie_Ticket_Booking.Actors;

import Movie_Ticket_Booking.ShowMovie.Movie;
import Movie_Ticket_Booking.ShowMovie.Show;

public class Admin extends Person{

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
