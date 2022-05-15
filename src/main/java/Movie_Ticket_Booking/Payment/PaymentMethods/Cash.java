package Movie_Ticket_Booking.BookingSeatsAndPayment.PaymentMethods;

import Hotel_Management.Data.Address;

public class Cash implements Payment {

    private Address address;

    public Cash(Address address) {
        this.address = address;
    }

    @Override
    public boolean makePayment(double amount) {
        return false;
    }
}
