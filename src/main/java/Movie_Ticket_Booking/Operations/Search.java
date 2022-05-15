package Movie_Ticket_Booking.Operations;

import Movie_Ticket_Booking.ShowMovie.Movie;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface Search {

    public List<Movie> searchByTitle(String title);
    public List<Movie> searchByLanguage(String language);
    public List<Movie> searchByGenre(String genre);
    public List<Movie> searchByReleaseDate(Date relDate);
    public List<Movie> searchByCity(String cityName);

}
