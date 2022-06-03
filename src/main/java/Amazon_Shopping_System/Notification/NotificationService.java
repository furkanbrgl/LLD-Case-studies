package Amazon_Shopping_System.Notification; /* Created by FurkanBrgl on 6/2/2022 */

import java.text.MessageFormat;

public class NotificationService{

    private boolean sendNotification(NotificationDomain notificationDomain) {

        Notification service = null;
        MessageFormat messageFormat;
        //run time polymorphism
        if(service.equals("Whatsapp")){
            //initiate with Email Notification class
            service = new WhatsApp();
            //// do this
        }
        if(service.equals("email")){
            //initiate with Email Notification class
            service = new Emil();
            //// do this
        }

        return true;
    }
}
