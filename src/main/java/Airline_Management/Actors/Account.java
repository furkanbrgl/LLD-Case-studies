package Airline_Management.Actors;

import Airline_Management.Enums.AccountStatus;

public class Account {

    String id;
    String password;
    AccountStatus accountStatus;

    boolean resetPassword() {
        return false;
    }
}
