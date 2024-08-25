import java.util.Scanner;

public class SumOfDigitInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000");
        int number = input.nextInt();
	
	if (number < 1 || number > 1000) {
		System.out.println("Please enter number from 1 to 1000");
	} else {
		int sumDigit = 0;
        	while (number > 0) {
        		sumDigit += number % 10;
        		number = number/10;
    		}
		System.out.printf("The sum of the digits is %d", sumDigit);
	}
    }
}