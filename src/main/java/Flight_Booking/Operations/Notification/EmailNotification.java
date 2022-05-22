package Flight_Booking.Operations.Notification;

public class EmailNotification extends Notification {

    String email;

    @Override
    public boolean sendNotification() {
        return false;
    }
}
