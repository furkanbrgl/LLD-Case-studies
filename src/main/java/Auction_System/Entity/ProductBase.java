package Auction_System.Entity; /* Created by FurkanBrgl on 5/27/2022 */

public class ProductBase {
    String id;
    String productName;

    public ProductBase(String id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
