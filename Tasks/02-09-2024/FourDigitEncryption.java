import java.util.Scanner;

public class FourDigitEncryption {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 4 digit number to encrypt: ");
		int numberInput = input.nextInt();

		if (numberInput < 1000 || numberInput > 9999) {
			System.out.println("Number must be a 4 digit number!");
		} else {
			int firstEncrytedDigit = ((numberInput/1000) + 7) % 10;
			int secondEncrytedDigit = (((numberInput/100) % 10) + 7) % 10;
			int thirdEncrytedDigit = (((numberInput/10) % 10) + 7) % 10;
			int fourEncrytedDigit = ((numberInput % 10) + 7) % 10;

			int encryptedDigit = (thirdEncrytedDigit * 1000) + (fourEncrytedDigit * 100) + (thirdEncrytedDigit * 10) + secondEncrytedDigit;
		
			System.out.printf("Encrypted data: %d", encryptedDigit);
		}
	}
}