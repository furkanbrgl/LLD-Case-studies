package Flight_Booking.Operations.Notification;

public class SmsNotification extends Notification{

    long no;

    @Override
    public boolean sendNotification() {
        return false;
    }
}
