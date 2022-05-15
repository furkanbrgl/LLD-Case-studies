package Movie_Ticket_Booking.BookingSeatsAndPayment.PaymentMethods;

import Hotel_Management.Enums.PaymentStatus;

import java.util.Date;

public interface Payment {

    public boolean makePayment(double amount);
}
