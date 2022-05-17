package Movie_Ticket_Booking.Operations;

import Movie_Ticket_Booking.Movie.Movie;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search{

    HashMap<String, List<Movie>> movieTitles = null;
    HashMap<String, List<Movie>> movieLanguages = null;
    HashMap<String, List<Movie>> movieGenres = null;
    HashMap<Date, List<Movie>> movieReleaseDates = null;
    HashMap<String, List<Movie>> movieCities = null;


    @Override
    public List<Movie> searchByTitle(String title) {
        return movieTitles.get(title);
    }

    @Override
    public List<Movie> searchByLanguage(String language) {
        return movieLanguages.get(language);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return null;
    }

    @Override
    public List<Movie> searchByReleaseDate(Date relDate) {
        return null;
    }

    @Override
    public List<Movie> searchByCity(String cityName) {
        return movieCities.get(cityName);
    }
}
