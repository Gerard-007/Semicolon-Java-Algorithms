public class CardValidity {

    public boolean validateCardLength(String cardNumber) {
        return cardNumber.length() >= 13 && cardNumber.length() <= 16;
    }


    public boolean validateCardType(String cardNumber) {
        return cardNumber.startsWith("4") || cardNumber.startsWith("5") || cardNumber.startsWith("37") || cardNumber.startsWith("6");
    }

    public String getCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }

    public boolean cardIsValid(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));

            if (doubleDigit) {
                digit *= 2;
            }
            if (digit > 9) {
                digit -= 9;
                //5399831619690403
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    }
}
