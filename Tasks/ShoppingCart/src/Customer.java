import java.util.ArrayList;

public class Customer extends User {
    private ArrayList<Billing> billingInfo;
    private ShoppingCart shoppingCart;

    public Customer(String name, int age, String email, String password, Address address, String phone) {
        super(name, age, email, password, address, phone);
        this.billingInfo = new ArrayList<>();
        this.shoppingCart = new ShoppingCart();
    }
}
