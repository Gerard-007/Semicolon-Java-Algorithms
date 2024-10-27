import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of contacts:");
        int numberOfContacts = input.nextInt();
        input.nextLine();

        String[][] contacts = new String[numberOfContacts][3];

        String menuOption;

        do {
            System.out.println("Select a menu (add, find, delete, exit): ");
            menuOption = input.nextLine();

            switch (menuOption) {
                case "add":
                    addContact(input, contacts);
                    break;
                case "find":
                    findContact(input, contacts);
                    break;
                case "delete":
                    deleteContact(input, contacts);
                    break;
                case "exit":
                    System.out.println("Exiting the phone book app.");
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        } while (!menuOption.equals("exit"));

        input.close();
    }


    public static void addContact(Scanner input, String[][] contacts) {
        System.out.println("Enter first name:");
        String fname = input.nextLine();
        System.out.println("Enter last name:");
        String lname = input.nextLine();
        System.out.println("Enter phone number:");
        String phone = input.nextLine();

        boolean added = false;
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0] == null) {
                contacts[i][0] = fname;
                contacts[i][1] = lname;
                contacts[i][2] = phone;
                added = true;
                System.out.printf("Contact added: " + fname + " " + lname);
                break;
            }
        }
        if (!added) {
            System.out.println("Contact list is full.");
        }
    }


    public static void findContact(Scanner input, String[][] contacts) {
        System.out.println("Enter name to find contact:");
        String nameToFind = input.nextLine();
        boolean found = false;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0] != null && (contacts[i][0].equalsIgnoreCase(nameToFind) || contacts[i][1].equalsIgnoreCase(nameToFind))) {
                System.out.printf("Contact found! Name: %s %s, Phone: %s%n", contacts[i][0], contacts[i][1], contacts[i][2]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }


    public static void deleteContact(Scanner input, String[][] contacts) {
        System.out.println("Enter name to delete:");
        String contactName = input.nextLine();
        boolean deleted = false;

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i][0] != null && (contacts[i][0].equalsIgnoreCase(contactName) || contacts[i][1].equalsIgnoreCase(contactName))) {
                contacts[i][0] = null;
                contacts[i][1] = null;
                contacts[i][2] = null;
                System.out.println("Contact deleted: " + contactName);
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            System.out.println("Contact not found for deletion.");
        }
    }
}
