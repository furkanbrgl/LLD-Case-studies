package Auction_System.Actors; /* Created by brglf on 5/27/2022 */

import Auction_System.Entity.Notification;
import Auction_System.Entity.UserBase;
import Auction_System.Interfaces.Observer;

import java.util.LinkedList;
import java.util.List;

public class User extends UserBase implements Observer {

    List<Notification> notifications; // latest notf. will be de firs one

    public User(String userId, String userName, String phoneNumber, String email) {
        super(userId, userName, phoneNumber, email);
        this.notifications = new LinkedList<>();
    }

    @Override
    public void update(String updateContent) {
        notifications.add(0,new Notification(updateContent, System.currentTimeMillis()));
        System.out.println(getUserName() + " has been notified. " +  " - " + updateContent);
    }
}
