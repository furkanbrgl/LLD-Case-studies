package Hotel_Management.Hotel;

import Hotel_Management.Enums.RoomStatus;
import Hotel_Management.Enums.RoomStyle;

import java.util.Date;
import java.util.List;

public class Room {

    private String roomNumber;
    private RoomStyle roomStyle;
    private RoomStatus roomStatus;
    private double price;
    private boolean isSmoking;

    private List<RoomKey> keys;
    private List<RoomHouseKeeping> houseKeepingLog;

    public boolean isAvailable() {
        return true;
    }

    public boolean checkIn() {
        return true;
    }

    public boolean checkOut() {
        return true;
    }


}
