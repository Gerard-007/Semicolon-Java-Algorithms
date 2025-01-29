import java.util.Scanner;

public class RunCardValidityMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardValidity cardValidity = new CardValidity();

        System.out.print("Enter your card number to validate: ");
        String cardNumber = scanner.nextLine().trim();

        if (!cardValidity.validateCardLength(cardNumber)) {
            System.out.println("Card Length: Invalid card length.");
        } else if (!cardValidity.validateCardType(cardNumber)) {
            System.out.println("Card Type: Invalid card type.");
        } else {
            System.out.println("Card Type: " + cardValidity.getCardType(cardNumber));
            if (cardValidity.cardIsValid(cardNumber)) {
	System.out.println("============================");
	System.out.printf("Card length: %d\n", cardNumber.length());
	System.out.printf("Card Number: %s\n", cardNumber);
               System.out.println("The card number is valid.");
            } else {
                System.out.println("The card number is invalid.");
            }
        }

        scanner.close();
    }
}