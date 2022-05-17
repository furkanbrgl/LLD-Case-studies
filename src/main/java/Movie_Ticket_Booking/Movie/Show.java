package Movie_Ticket_Booking.Movie;

import java.util.Date;

public class Show {
    private int showId;
    private Date CreatedDate;
    private Date StartTime;
    private Date EndTime;
    private CinemaHall cinemaHall;
    private Movie movie;

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date endTime) {
        EndTime = endTime;
    }

    public CinemaHall getCinamaHall() {
        return cinemaHall;
    }

    public void setCinamaHall(CinemaHall cinamaHall) {
        this.cinemaHall = cinamaHall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
