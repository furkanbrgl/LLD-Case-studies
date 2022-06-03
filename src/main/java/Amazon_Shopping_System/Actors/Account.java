package Amazon_Shopping_System.Actors; /* Created by FurkanBrgl on 6/2/2022 */

import Amazon_Shopping_System.Data.AccountStatus;
import Amazon_Shopping_System.Data.Address;
import Amazon_Shopping_System.Product.Product;
import Amazon_Shopping_System.Product.ProductReview;

public class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private String name;
    private Address shippingAddress;
    private String email;
    private String phone;

//    private List<CreditCard> creditCards;
//    private List<ElectronicBankTransfer> bankAccounts;

    public boolean addProduct(Product product) {
        return false;
    }

    public boolean addProductReview(ProductReview review) {
        return false;
    }

    public boolean resetPassword() {
        return false;
    }
}
