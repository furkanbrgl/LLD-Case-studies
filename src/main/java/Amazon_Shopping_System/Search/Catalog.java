package Amazon_Shopping_System.Search; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Product.Product;

import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {
    HashMap<String, List<Product>> productNames;
    HashMap<String, List<Product>> productCategories;

    public List<Product> searchProductsByName(String name) {
        return productNames.get(name);
    }
    public List<Product> searchProductsByCategory(String category) {
        return productCategories.get(category);
    }
}
