package Amazon_Shopping_System.Search; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Product.Product;

import java.util.List;

public interface Search {
    public List<Product> searchProductsByName(String name);
    public List<Product> searchProductsByCategory(String category);
}
