package Auction_System.Interfaces; /* Created by FurkanBrgl on 5/27/2022 */

import Auction_System.Enums.ObserverType;

public interface Publisher {

    public void subscribeAuction(ObserverType observerType, Observer o);
    public void unsubscribeAuction(ObserverType observerType, Observer o);
    public void notifyBuyers(ObserverType observerType, String detail);
}
