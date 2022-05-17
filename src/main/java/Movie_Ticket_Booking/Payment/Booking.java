package Movie_Ticket_Booking.Payment;

import Hotel_Management.Enums.BookingStatus;
import Movie_Ticket_Booking.Actors.Customer;
import Movie_Ticket_Booking.Actors.FrontDeskOfficer;
import Movie_Ticket_Booking.Payment.PaymentMethods.Payment;
import Movie_Ticket_Booking.Movie.Show;
import Movie_Ticket_Booking.Movie.ShowSeat;

import java.util.Date;
import java.util.List;

public class Booking {

    private String bookingNumber;
    private int numberOfSeat;
    private Date createdOn;
    private BookingStatus bookingStatus;
    private FrontDeskOfficer frontDeskOfficer;
    private Customer customer;
    private Show show;
    private List<ShowSeat> showSeats;

    private Payment payment;

    public Booking(int numberOfSeat, Customer customer, Show show) {
        this.numberOfSeat = numberOfSeat;
        this.customer = customer;
        this.show = show;
    }

    public boolean makePayment(Payment payment) {
        return true;
    }

    public boolean cancel() {
        return false;
    }

    public boolean assignSeats(List<ShowSeat> showSeats){
        return false;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }
}
