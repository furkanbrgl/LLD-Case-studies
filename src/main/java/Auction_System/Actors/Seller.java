package Auction_System.Actors; /* Created by FurkanBrgl on 5/27/2022 */

import java.util.List;

public class Seller extends User {

    List<String> auctionIds;

    public Seller(String userId, String userName, String phoneNumber, String email) {
        super(userId, userName, phoneNumber, email);
    }

    public List<String> getAuctions() {
        return auctionIds;
    }
}
