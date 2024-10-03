public class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void transferFunds(double amount, Account recipient) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient fund!");
        } else {
            balance -= amount;
            recipient.deposit(amount);
        }
    }

    public void withdrawFund(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient fund!");
        } else {
            balance -= amount;
            recipient.deposit(amount);
        }
    }
}