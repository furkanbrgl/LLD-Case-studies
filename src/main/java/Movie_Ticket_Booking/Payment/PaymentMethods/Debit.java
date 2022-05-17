package Movie_Ticket_Booking.Payment.PaymentMethods;


import Hotel_Management.Data.Address;

public class Debit extends PaymentBase implements Payment {

    private int cardId;
    private String name;

    public Debit(double amount, int cardId, String name) {
        super(amount);
        this.cardId = cardId;
        this.name = name;

    }

    @Override
    public boolean makePayment(double amount) {
        return false;
    }
}
