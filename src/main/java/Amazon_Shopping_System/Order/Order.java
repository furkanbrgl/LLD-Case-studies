package Amazon_Shopping_System.Order; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Actors.Customer;
import Amazon_Shopping_System.Data.OrderStatus;
import Amazon_Shopping_System.Notification.NotificationService;
import Movie_Ticket_Booking.Payment.PaymentMethods.Payment;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderNumber;
    private OrderStatus status;
    private Date orderDate;
    private List<OrderLog> orderLog;
    private List<Item> items;
    private Customer buyer;
    private NotificationService notificationService;

    public boolean sendForShipment() {
        return false;
    }

    public boolean makePayment(Payment payment) {
        return false;
    }

    public boolean addOrderLog(OrderLog orderLog) {
        return false;
    }
}
