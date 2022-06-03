package Amazon_Shopping_System.Shipment; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Actors.Account;

import java.util.Date;

public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public boolean sendNotification(Account account) {
        return false;
    }
}
