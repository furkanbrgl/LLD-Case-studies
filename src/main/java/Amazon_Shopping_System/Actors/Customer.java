package Amazon_Shopping_System.Actors; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Order.Item;
import Amazon_Shopping_System.Order.Order;
import Amazon_Shopping_System.Order.ShoppingCart;
import Amazon_Shopping_System.Search.Search;

public abstract class Customer {
    private ShoppingCart cart;
    private Search search;

    public ShoppingCart getShoppingCart() {
        return null;
    }

    public boolean addItemToCart(Item item) {
        return false;
    }

    public boolean removeItemFromCart(Item item) {
        return false;
    }
}
