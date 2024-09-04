import java.util.Scanner;

public class InvertedRightAngledTriangle {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numberInput = input.nextInt();
		
		drawRightAngledTriangle(numberInput);
	}


	public static void drawRightAngledTriangle(int number) {
		for(int x = number; x >= 1; x--) {
			for(int y = x; y >= 1; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}