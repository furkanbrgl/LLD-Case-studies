    It should be able to list the cities where affiliate cinemas are located.
    Each cinema can have multiple halls and each hall can run one movie show at a time.
    Each Movie will have multiple shows.
    Customers should be able to search movies by their title, language, genre, release date, and city name.
    Once the customer selects a movie, the service should display the cinemas running that movie and its available shows.
    The customer should be able to select a show at a particular cinema and book their tickets.
    The service should show the customer the seating arrangement of the cinema hall. The customer should be able to select multiple seats according to their preference.
    The customer should be able to distinguish between available seats and booked ones.
    The system should send notifications whenever there is a new movie, as well as when a booking is made or canceled.
    Customers of our system should be able to pay with credit cards or cash.
    The system should ensure that no two customers can reserve the same seat.
    Customers should be able to add a discount coupon to their payment.

/*
Account: Admin will be able to add/remove movies and shows, as well as block/unblock accounts. Customers can search for movies and make bookings for shows. FrontDeskOffice can book tickets for movie shows.

Guest: Guests can search and view movies descriptions. To make a booking for a show they have to become a registered member.

Cinema: The main part of the organization for which this software has been designed. It has attributes like ‘name’ to distinguish it from other cinemas.

CinemaHall: Each cinema will have multiple halls containing multiple seats.

City: Each city can have multiple cinemas.

Movie: The main entity of the system. Movies have attributes like title, description, language, genre, release date, city name, etc.

Show: Each movie can have many shows; each show will be played in a cinema hall.

CinemaHallSeat: Each cinema hall will have many seats.

ShowSeat: Each ShowSeat will correspond to a movie Show and a CinemaHallSeat. Customers will make a booking against a ShowSeat.

Booking: A booking is against a movie show and has attributes like a unique booking number, number of seats, and status.

Payment: Responsible for collecting payments from customers.

Notification: Will take care of sending notifications to customers.*/
