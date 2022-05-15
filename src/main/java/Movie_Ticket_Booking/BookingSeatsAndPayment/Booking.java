package Movie_Ticket_Booking.BookingSeatsAndPayment;

import Hotel_Management.Enums.BookingStatus;
import Movie_Ticket_Booking.BookingSeatsAndPayment.PaymentMethods.Payment;
import Movie_Ticket_Booking.ShowMovie.Show;

import java.util.Date;
import java.util.List;

public class Booking {

    private String bookingNumber;
    private int numberOfSeat;
    private Date createdOn;
    private BookingStatus bookingStatus;

    private Show show;
    private List<ShowSeat> showSeats;

    private Payment payment;

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
