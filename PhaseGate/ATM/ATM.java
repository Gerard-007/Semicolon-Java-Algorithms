import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of contacts:");
        // int numberOfContacts = input.nextInt();
        // input.nextLine();

        String[][] accounts = new String[2][4];

        int menuOption;

        do {
            System.out.println("""
            Select a menu:
                1 -> create account
                2 -> close account
                3 -> deposit money
                4 -> withdraw money
                5 -> check balance
                6 -> transfer
                7 -> change pin
                0 -> exit program
            """);

            menuOption = input.nextInt();

            switch (menuOption) {
                case 1:
                    createAccount(input, accounts);
                    break;
                case 2:
                    closeAccount(input, accounts);
                    break;
                case 3:
                    depositMoney(input, accounts);
                    break;
                case 4:
                    withdrawMoney(input, accounts);
                    break;
                case 5:
                    checkAccountBalance(input, accounts);
                    break;
                case 6:
                    transferMoney(input, accounts);
                    break;
                case 7:
                    changeTransactionPin(input, accounts);
                    break;
                case 0:
                    System.out.println("Exiting the ATM app.");
                    break;

                default:
                    System.out.println("Unknown command.");
            }
        } while (menuOption != 0);

        input.close();
    }


    public static void createAccount(Scanner input, String[][] accounts) {
        System.out.println("Enter first name:");
        String fname = input.nextLine();
        System.out.println("Enter last name:");
        String lname = input.nextLine();
        System.out.println("Enter pin number:");
        String transactionPin = input.nextLine();
        double balance = 0.00;

        boolean added = false;
        for (int i = 0; i < accounts.length; i++) {
            if (transactionPin.length() == 4) {   
                if (accounts[i][0] == null) {
                    accounts[i][0] = fname;
                    accounts[i][1] = lname;
                    accounts[i][2] = transactionPin;
                    accounts[i][3] = String.format("%f", balance);
                    added = true;
                    System.out.printf("Account created: " + fname + " " + lname);
                    break;
                }
            } else {
                System.out.println("Invalid PIN format must be a 4 digit.");
                break;
            }
        }
        
        if (!added) {
            System.out.println("Account list is full.");
        }
    }

    
    public static void closeAccount(Scanner input, String[][] accounts) {
        System.out.println("Enter account first name:");
        String fname = input.nextLine();
        System.out.println("Enter account last name:");
        String lname = input.nextLine();
        System.out.println("Enter account transaction PIN:");
        String transactionPin = input.nextLine();
        boolean deleted = false;
    
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] != null && 
                accounts[i][0].equalsIgnoreCase(fname) && 
                accounts[i][1].equalsIgnoreCase(lname) && 
                accounts[i][2].equals(transactionPin)) {

                accounts[i][0] = null;
                accounts[i][1] = null;
                accounts[i][2] = null;
                accounts[i][3] = null;
                
                System.out.println("Account deleted: " + fname + " " + lname);
                deleted = true;
                break;
            }
        }
    
        if (!deleted) {
            System.out.println("Account not found for deletion.");
        }
    }
    

    public static void depositMoney(Scanner input, String[][] accounts) {
        System.out.println("Enter account first name:");
        String fname = input.nextLine();
        System.out.println("Enter account last name:");
        String lname = input.nextLine();
        boolean deposited = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] != null && accounts[i][0].equalsIgnoreCase(fname) && accounts[i][1].equalsIgnoreCase(lname)) {
                System.out.println("Enter account transaction PIN: ");
                String transactionPin = input.nextLine();
                System.out.println("Enter amount to deposit: ");
                double amount = input.nextFloat();
                if (accounts[i][2].equals(transactionPin)) {
                    if (amount > 0) {
                        accounts[i][3] = String.format("%f", amount);
                        System.out.printf("Amount N%f deposited successfully\n", amount);
                        System.out.printf("Your new balance is N%s\n", accounts[i][3]);
                        deposited = true;
                        break;
                    } else {
                        System.out.printf("Insufficient amount N%f to deposit.\n", amount);
                        break;
                    }
                } else {
                    System.out.printf("Wrong/Transaction Pin not associated with the account %s %s.", fname, lname);
                    break;
                }
            }
        }
        if (!deposited) {
            System.out.println("Account not found to deposit money.");
        }
    }

    
    public static void withdrawMoney(Scanner input, String[][] accounts) {
        System.out.println("Enter account first name:");
        String fname = input.nextLine();
        System.out.println("Enter account last name:");
        String lname = input.nextLine();
        boolean withdrawn = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] != null && accounts[i][0].equalsIgnoreCase(fname) && accounts[i][1].equalsIgnoreCase(lname)) {
                System.out.println("Enter account transaction PIN: ");
                String transactionPin = input.nextLine();
                System.out.println("Enter amount to withdraw: ");
                double amount = input.nextFloat();
                if (accounts[i][2].equals(transactionPin)) {
                    double balance = Double.parseDouble(accounts[i][3]);
                    if (balance > amount) {
                        balance -= amount;
                        accounts[i][3] = String.format("%f", balance);
                        System.out.printf("Amount N%d debited successfully\n", amount);
                        System.out.printf("Your new balance is N%s\n", accounts[i][3]);
                        withdrawn = true;
                        break;
                    } else {
                        System.out.printf("Insufficient fund for account %s %s balance: N%f.", fname, lname, balance);
                        break;
                    }
                } else {
                    System.out.printf("Wrong/Transaction Pin not associated with the account %s %s.", fname, lname);
                    break;
                }
            }
        }
        if (!withdrawn) {
            System.out.println("Account not found to withdraw money.");
        }
    }

    
    public static void checkAccountBalance(Scanner input, String[][] accounts) {
        System.out.println("Enter account first name:");
        String fname = input.nextLine();
        System.out.println("Enter account last name:");
        String lname = input.nextLine();
        boolean found = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] != null && accounts[i][0].equalsIgnoreCase(fname) && accounts[i][1].equalsIgnoreCase(lname)) {
                System.out.println("Enter account transaction PIN: ");
                String transactionPin = input.nextLine();
                if (accounts[i][2].equals(transactionPin)) {
                    System.out.printf("""
                    Account Details:
                    Name: %s %s
                    Balance: N%s
                    \n""", fname, lname, accounts[i][3]);
                    found = true;
                    break;
                } else {
                    System.out.printf("Wrong/Transaction Pin not associated with the account %s %s.", fname, lname);
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }

    
    public static void transferMoney(Scanner input, String[][] accounts) {
        System.out.println("Enter sender first/last name:");
        String sname = input.nextLine();

        System.out.println("Enter reciever first/last name:");
        String rname = input.nextLine();

        System.out.println("Enter amount to transfer: ");
        double amount = input.nextFloat();

        double temp = 0.00;
        boolean debited = false;
        boolean transferSuccessful = false;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] != null && (accounts[i][0].equalsIgnoreCase(sname) || accounts[i][1].equalsIgnoreCase(sname))) {
                System.out.println("Enter account transaction PIN: ");
                String transactionPin = input.nextLine();
                if (accounts[i][2].equals(transactionPin)) {
                    double balance = Double.parseDouble(accounts[i][3]);
                    if (balance > amount) {
                        balance -= amount;
                        temp = amount;
                        accounts[i][3] = String.format("%f", balance);
                        System.out.printf("""
                        Debit Alert!
                        Reciever: %s
                        Balance: N%f
                        \n
                        """, rname, balance);
                        debited = true;
                        break;
                    } else {
                        System.out.printf("Insufficient fund for account %s balance: N%f.", sname, balance);
                        break;
                    }
                } else {
                    System.out.printf("Wrong/Transaction Pin not associated with the account %s.", sname);
                    break;
                }
            }
        }
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i][0] != null && (accounts[i][0].equalsIgnoreCase(rname) || accounts[i][1].equalsIgnoreCase(rname))) {
                System.out.println("Enter account transaction PIN: ");
                String transactionPin = input.nextLine();
                if (accounts[i][2].equals(transactionPin)) {
                    double balance = Double.parseDouble(accounts[i][3]);
                    if (temp == amount) {
                        balance += temp;
                        transferSuccessful = true;
                        accounts[i][3] = String.format("%f", balance);
                        System.out.printf("""
                        Credit Alert!
                        Sender: %s
                        Balance: N%f
                        \n
                        """, sname, balance);
                        break;
                    }
                } else {
                    System.out.printf("Wrong/Transaction Pin not associated with the account %s.", sname);
                    break;
                }
            }
        }
        if (!transferSuccessful) {
            System.out.println("Account not found to transfer money.");
        }
    }

    
    public static void changeTransactionPin(Scanner input, String[][] accounts) {
        System.out.println("Enter account first name:");
        String fname = input.nextLine();
        System.out.println("Enter account last name:");
        String lname = input.nextLine();
        boolean found = false;
    
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i][0] != null && 
                accounts[i][0].equalsIgnoreCase(fname) && 
                accounts[i][1].equalsIgnoreCase(lname)) {
                
                System.out.println("Enter account transaction PIN: ");
                String transactionPin = input.nextLine();
                if (accounts[i][2].equals(transactionPin)) {
                    System.out.println("Enter new account transaction PIN: ");
                    String newTransactionPin = input.nextLine();
                    if (newTransactionPin.length() == 4) {
                        accounts[i][2] = newTransactionPin;
                        System.out.println("Transaction PIN changed successfully.");
                        found = true;
                        break;
                    } else {
                        System.out.println("Invalid PIN format must be a 4 digit.");
                        break;
                    }
                } else {
                    System.out.printf("Wrong Transaction PIN not associated with the account %s %s.%n", fname, lname);
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Account not found.");
        }
    }
}
