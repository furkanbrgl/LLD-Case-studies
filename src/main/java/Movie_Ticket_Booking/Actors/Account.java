package Movie_Ticket_Booking.Actors;

import Movie_Ticket_Booking.Enums.AccountStatus;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    public boolean resetPassword() {
        return false;
    }

    public boolean LogIn(){
        return true;
    }

    public boolean LogOut(){
        return true;
    }
}
