    We’ll focus on the following set of requirements while designing the Hotel Management System:

    The system should support the booking of different room types like standard, deluxe, family suite, etc.

    Guests should be able to search the room inventory and book any available room.

    The system should be able to retrieve information, such as who booked a particular room, or what rooms were booked by a specific customer.

    The system should allow customers to cancel their booking - and provide them with a full refund if the cancelation occurs before 24 hours of the check-in date.

    The system should be able to send notifications whenever the booking is nearing the check-in or check-out date.

    The system should maintain a room housekeeping log to keep track of all housekeeping tasks.

    Any customer should be able to add room services and food items.    

    Customers can ask for different amenities.  

    The customers should be able to pay their bills through credit card, check or cash.

/*
Here are the main classes of our Hotel Management System:

Hotel and HotelLocation: Our system will support multiple locations of a hotel.

Room: The basic building block of the system. Every room will be uniquely identified by the room number. Each Room will have attributes like Room Style, Booking Price, etc.

Account: We will have different types of accounts in the system: one will be a guest to search and book rooms, another will be a receptionist. Housekeeping will keep track of the housekeeping records of a room, and a Server will handle room service.

RoomBooking: This class will be responsible for managing bookings for a room.

Notification: Will take care of sending notifications to guests.

RoomHouseKeeping: To keep track of all housekeeping records for rooms.

RoomCharge: Encapsulates the details about different types of room services that guests have requested.

Invoice: Contains different invoice-items for every charge against the room.

RoomKey: Each room can be assigned an electronic key card. Keys will have a barcode and will be uniquely identified by a key-ID.
*/
