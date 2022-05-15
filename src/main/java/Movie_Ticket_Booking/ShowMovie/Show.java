package Movie_Ticket_Booking.ShowMovie;

import Movie_Ticket_Booking.CityCinemaAndHalls.CinemaHall;

import java.util.Date;

public class Show {
    private int showId;
    private Date CreatedDate;
    private Date StartTime;
    private Date EndTime;
    private CinemaHall cinamaHall;
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
        return cinamaHall;
    }

    public void setCinamaHall(CinemaHall cinamaHall) {
        this.cinamaHall = cinamaHall;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
