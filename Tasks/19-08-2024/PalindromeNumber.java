import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
	
	if(number < 100 || number > 999){
		System.out.println("Please enter a valid 3 digit number");
	} else {
		int digit1 = number / 100;
        	int digit2 = number % 10;

        	if (digit1 == digit2) {
            		System.out.printf("%d is a palindrome.", number);
        	} else {
            		System.out.printf("%d is not a palindrome.", number);
        	}
	}
    }
}