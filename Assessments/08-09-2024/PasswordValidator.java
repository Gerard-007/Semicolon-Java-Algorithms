public class PasswordValidator {
    public static void main(String[] args) {
        String password1 = "abcdef12345";
        System.out.println("Password: " + password1 + " is valid? " + isValidPassword(password1));
    }


    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount > 2 ? true : false;
    }
}
