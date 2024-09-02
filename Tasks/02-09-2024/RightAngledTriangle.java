import java.util.Scanner;

public class RightAngledTriangle {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numberInput = input.nextInt();
		
		drawRightAngledTriangle(numberInput);
	}


	public static void drawRightAngledTriangle(int number) {
		for(int x = 1; x <= number; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}