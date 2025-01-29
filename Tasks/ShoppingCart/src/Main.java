import java.util.Scanner;
import java.lang.System.*;

public class Main {
    public static Scanner input = new Scanner(System.in);
    private static Estore genasStore = new Estore();

    public static void main(String[] args) {
        mainMenu();
    }

    public static void display(String message) {
        System.out.println(message);
    }

    private static void mainMenu() {
        display("""
        Welcome to the Genas Store!
        Enter 1 to add a new customer to the Genas Store!
        Enter 2 to add a new seller to the Genas Store!
        Enter 3 to add a new admin to the Genas Store!
        """);
        String option = input.nextLine();
        switch (option) {
            case "1" -> addCustomer();
            case "2" -> addSeller();
            case "3" -> addAdmin();
        }
    }


    private static Address addAddress() {
        display("Enter your customer city: ");
        String city = input.nextLine();
        display("Enter your customer street: ");
        String street = input.nextLine();
        display("Enter your customer house number: ");
        String houseNumber = input.nextLine();
        display("Enter your customer state: ");
        String state = input.nextLine();
        display("Enter your customer country: ");
        String Country = input.nextLine();
        return new Address(city, Country, houseNumber, street, state);
    }

    private static void addCustomer() {
        display("Enter your customer name: ");
        String name = input.nextLine();
        display("Enter your customer age: ");
        int age = input.nextInt();
        input.nextLine();
        display("Enter your customer email: ");
        String email = input.nextLine();
        display("Enter your customer password: ");
        String password = input.nextLine();
        display("Enter your customer phone: ");
        String phone = input.nextLine();
        Customer customer = new Customer(name, age, email, password, addAddress(), phone);
        genasStore.addCustomer(customer);
        display("Customer added successfully!");
    }

    private static void addSeller() {
    }

    private static void addAdmin() {
    }
}
