package Flight_Booking.Operations.Payment;

public class PayPal implements PaymentMethod{

    String name;
    String payPalInfo;

    public PayPal(String name, String payPalInfo) {
        this.name = name;
        this.payPalInfo = payPalInfo;
    }

    @Override
    public boolean pay() {
        return false;
    }
}
