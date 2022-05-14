package Hotel_Management.ServicesAndBooking;

import java.util.Date;

public abstract class RoomCharge {
    public Date issueAt;

    public boolean addInvoiceItem(Object invoice) {
        return false;
    }
}
