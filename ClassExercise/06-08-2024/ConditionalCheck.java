import java.util.Scanner;

public class ConditionalCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enters the first number: ");
		int numberOne = input.nextInt();

		
		System.out.print("Enters the second number: ");
		int numberTwo = input.nextInt();

		if(numberOne > numberTwo) {
			System.out.printf("%d is greater", numberOne);
		} else {
			System.out.printf("%d is greater", numberTwo);
		}
	}
}