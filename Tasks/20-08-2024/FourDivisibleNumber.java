import java.util.Scanner;


public class FourDivisibleNumber {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);


		while(true) {
			System.out.print("Enter a number or 0 to exit: ");
			int inputVal = input.nextInt();

			if(inputVal != 0) {
				if(inputVal % 4 == 0) {
					System.out.printf("Number %d is divisible by 4 \n", inputVal);
				} else {
					System.out.printf("Number %d is not divisible by 4 \n", inputVal);
				}
			} else {
				System.out.println("Exiting...");
				break;
			}
		}
	}
}