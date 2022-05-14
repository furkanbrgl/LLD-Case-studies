package Hotel_Management.ServicesAndBooking;

import Hotel_Management.Enums.BookingStatus;
import Hotel_Management.Hotel.Room;

import java.util.Date;

public class RoomBooking {

    private String reservationNumber;
    private Date startDate;
    private int durationInDays;
    private BookingStatus status;
    private Date checkin;
    private Date checkout;

    private int guestID;
    private Room room;
 //   private Invoice invoice;
 //   private List<Notification> notifications;

    public static RoomBooking fetchDetails(String reservationNumber) {
        return null;
    }


}
