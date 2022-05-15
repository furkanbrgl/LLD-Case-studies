package Movie_Ticket_Booking.BookingSeatsAndPayment.PaymentMethods;

import Hotel_Management.Enums.PaymentStatus;

import java.util.Date;

public abstract class PaymentProperties implements Payment {

    private double amount;
    private Date createdOn;
    private int transactionId;
    private PaymentStatus status;

}
