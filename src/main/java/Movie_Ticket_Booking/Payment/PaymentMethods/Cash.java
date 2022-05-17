package Movie_Ticket_Booking.Payment.PaymentMethods;

import Hotel_Management.Data.Address;

public class Cash extends PaymentBase implements Payment {

    private Address address;

    public Cash(double amount, Address address) {
        super(amount);
        this.address = address;
    }

    @Override
    public boolean makePayment(double amount) {
        return false;
    }
}
