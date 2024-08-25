import java.util.Scanner;


public class FourAndFiveDivisibleNumber {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);


		while(true) {
			System.out.print("Enter a number or 0 to exit: ");
			int inputVal = input.nextInt();

			if(inputVal != 0) {
				if(inputVal % 4 == 0 && inputVal % 5 == 0) {
					System.out.printf("Number %d is divisible by 4 and 5 \n", inputVal);
				} else {
					System.out.printf("Number %d is not divisible by 4 and 5 \n", inputVal);
				}
			} else {
				System.out.println("Exiting...");
				break;
			}
		}
	}
}