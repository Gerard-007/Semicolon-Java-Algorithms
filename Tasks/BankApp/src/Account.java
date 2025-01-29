import java.util.Arrays;

public class Account {
    private String name;
    private double balance;
    private String phone;
    private String accountNumber;
    private String pin;

    public Account(String name, String phone, String pin) throws AccountException {
        this.name = name;
        this.balance = 0;
        this.phone = phone;
        this.accountNumber = this.generateAccountNumber(phone);
        this.pin = pin;
    }

    public static boolean onlyDigits(String s) {
        return s.matches("[0-9]+");
    }

    public String generateAccountNumber(String phone) throws AccountException {
        String result = "";
        if (phone.trim().length() != 11) {
            throw new AccountException(16, "Phone number must be 11 digits");
        }
        else if (phone.trim().charAt(0) == '0') {
            result = phone.trim().substring(1);
        }
        return result;
    }
}
