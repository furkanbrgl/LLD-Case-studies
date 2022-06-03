package Auction_System.Entity; /* Created by FurkanBrgl on 5/27/2022 */

public class Notification {
    String message;
    long date;

    public Notification(String message, long date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
