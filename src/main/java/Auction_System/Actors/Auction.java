package Auction_System.Actors; /* Created by brglf on 5/27/2022 */

import Auction_System.Entity.AuctionProduct;
import Auction_System.Enums.AuctionState;
import Auction_System.Enums.ObserverType;
import Auction_System.Interfaces.Observer;
import Auction_System.Interfaces.Publisher;

import java.util.*;

public class Auction implements Publisher {

    String auctionId;
    Seller seller;
    long startDate;
    long endDate;

    List<AuctionProduct> auctionProducts;
    AuctionState auctionState;

    private Map<ObserverType, List<Observer>> observers;

    public Auction() {
        this.auctionProducts = new ArrayList<>();

        this.observers = new HashMap<>();
        this.observers.put(ObserverType.SELLER, new LinkedList<>());
        this.observers.put(ObserverType.BUYER, new LinkedList<>());
    }
    public Map<ObserverType, List<Observer>> getObservers() {
        return this.observers;
    }

    @Override
    public void subscribeAuction(ObserverType observerType, Observer o) {
        getObservers().get(observerType).add(o);
    }

    @Override
    public void unsubscribeAuction(ObserverType observerType, Observer o) {
        getObservers().get(observerType).remove(o);
    }

    @Override
    public void notifyBuyers(ObserverType type, String detail) {
        for(Observer o : getObservers().get(type))
            o.update(detail);
    }

    public void addProduct(AuctionProduct product) {
        auctionProducts.add(product);
        notifyBuyers(ObserverType.BUYER,"New product has been added, Product Detail : " + product.getProductName());
    }
}
