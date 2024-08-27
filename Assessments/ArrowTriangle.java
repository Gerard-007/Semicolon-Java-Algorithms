import java.util.Scanner;


public class ArrowTriangle {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int numberValue = input.nextInt();
		
		drawArrowTriangle(numberValue);
	}


	public static void drawArrowTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		for (int i = 1; i <= size; i++) {
			for (int j = size - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}