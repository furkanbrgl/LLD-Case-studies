package Auction_System.Actors; /* Created by FurkanBrgl on 5/27/2022 */

import java.util.HashMap;
import java.util.Map;

public class Buyer extends User {

    //Auction Id, <ProductId, Bid>
    Map<String, Map<String, Double>> subscribedAuctions;

    public Buyer(String userId, String userName, String phoneNumber, String email) {
        super(userId, userName, phoneNumber, email);
        this.subscribedAuctions = new HashMap<>();
    }

    public Map<String, Map<String, Double>> getSubscribedAuctions() {
        return subscribedAuctions;
    }
}
