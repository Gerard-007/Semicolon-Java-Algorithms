public class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getName() {
        return this.bankName;
    }

    public void registerAccount(String name, String phone, String pin) {
    }

    public void getAccount(String accountNumber) {
    }

    public void deposit(String accountNumber, double amount) {
    }

    public void withdraw(String accountNumber, double amount, String pin) {
    }

    public void transfer(String sender, String recipient, double amount, String pin) {
    }
}
