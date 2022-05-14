package Hotel_Management.Hotel;

import java.util.Date;

public class RoomKey {

    private String keyId;
    private String barcode;
    private Date issueDate;
    private boolean isActive;
    private boolean isMaster;

    public boolean assignToRoom(Room room) {
        return false;
    }

    public boolean isActive() {
        return false;
    }

}
