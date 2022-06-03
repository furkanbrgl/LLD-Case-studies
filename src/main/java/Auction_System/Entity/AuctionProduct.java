package Auction_System.Entity; /* Created by FurkanBrgl on 5/27/2022 */

import Auction_System.Enums.AuctionProductStatus;

public class AuctionProduct extends Product{

    Double price;
    AuctionProductStatus status;
    Double currentBid;
    String currentWinnerBuyerId;

    public AuctionProduct(String id, String productName, Double price, AuctionProductStatus status, Double currentBid, String currentWinnerBuyerId) {
        super(id, productName);
        this.price = price;
        this.status = AuctionProductStatus.UNBID;
        this.currentBid = 0.0;
        this.currentWinnerBuyerId = "No One";
    }
}
