package Movie_Ticket_Booking.Actors;

import Hotel_Management.Data.Address;

public abstract class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;

    private Account account; // Composition. Create has a realation
}
