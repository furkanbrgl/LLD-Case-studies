package Movie_Ticket_Booking.ShowMovie;

import Movie_Ticket_Booking.Actors.Admin;

import java.util.Date;
import java.util.List;

public class Movie {
    private String title;
    private String desc;
    private int duration;
    private String language;
    private Date releaseDate;
    private String country;
    private String genre;

    private Admin movieAddBy;

    private List<Show> shows;


    public List<Show> getShows(){
        return null;
    }

}
