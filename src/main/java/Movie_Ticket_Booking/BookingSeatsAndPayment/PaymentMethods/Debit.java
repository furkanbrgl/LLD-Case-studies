package Movie_Ticket_Booking.BookingSeatsAndPayment.PaymentMethods;


public class Debit extends PaymentProperties {

    private int cardId;
    private String name;

    public Debit(int cardId, String name) {
        this.cardId = cardId;
        this.name = name;
    }

    @Override
    public boolean makePayment(double amount) {
        return false;
    }
}
