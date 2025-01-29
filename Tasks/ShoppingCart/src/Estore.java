import java.util.ArrayList;
import java.util.List;

public class Estore {
    private List<Customer> customers;
    private List<Seller> sellers;
    private List<Admin> admins;

    public Estore() {
        customers = new ArrayList<Customer>();
        sellers = new ArrayList<Seller>();
        admins = new ArrayList<Admin>();
    }

    public void addCustomer(Customer customer) { customers.add(customer); }

    public void addSeller(Seller seller) { sellers.add(seller); }

    public void addAdmin(Admin admin) { admins.add(admin); }

    public List<Customer> getCustomers() { return customers; }

    public List<Seller> getSellers() {
        return sellers;
    }

    public List<Admin> getAdmins() { return admins; }

//    public Customer getCustomer(String email) {
//        for (Customer customer : customers) {
//            if (customer == email) return customer;
//    }
}
