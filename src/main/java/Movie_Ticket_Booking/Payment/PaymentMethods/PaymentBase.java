package Movie_Ticket_Booking.Payment.PaymentMethods;

import Hotel_Management.Enums.PaymentStatus;

import java.util.Date;
import java.util.UUID;

public class PaymentBase {

    private double amount;
    private Date createdOn;
    private UUID transactionId;
    private PaymentStatus status;

    public PaymentBase(double amount) {
        this.amount = amount;
        this.createdOn = new Date();
        this.transactionId = UUID.randomUUID();
        this.status = PaymentStatus.PENDING;
    }
}
