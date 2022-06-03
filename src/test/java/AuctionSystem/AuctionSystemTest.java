package AuctionSystem; /* Created by FurkanBrgl on 5/27/2022 */

import Auction_System.Actors.Auction;
import Auction_System.Actors.User;
import Auction_System.Entity.AuctionProduct;
import Auction_System.Entity.Product;
import Auction_System.Enums.AuctionProductStatus;
import Auction_System.Enums.ObserverType;
import Auction_System.Interfaces.Observer;
import org.junit.Test;

public class AuctionSystemTest {

    @Test
    public void test(){

        Auction auction = new Auction();

        AuctionProduct duck = new AuctionProduct("1", "duck", 1.2, AuctionProductStatus.UNBID, 0.0, "non");

        Observer userOne = new User("12","furkan", "2343432", "q@q.com");
        Observer userTwo = new User("13","birgul", "5433422", "a@a.com");

        auction.subscribeAuction(ObserverType.SELLER, userOne);
        auction.subscribeAuction(ObserverType.SELLER, userTwo);


        auction.addProduct(duck);

    }
}
