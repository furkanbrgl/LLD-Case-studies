package Amazon_Shopping_System.Product; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Actors.Account;

import java.util.List;

public class Product {
    private String productID;
    private String name;
    private String description;
    private double price;
    private ProductCategory category;
    private int availableItemCount;

    List<ProductReview> reviewList;

    private Account seller;

    public int getAvailableCount() {
        return 0;
    }

    public boolean updatePrice(double newPrice) {
        return false;
    }
}
