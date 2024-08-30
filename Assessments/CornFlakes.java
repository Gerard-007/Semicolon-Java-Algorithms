import java.util.Scanner;

public class CornFlakes {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to multiply: ");
		int number = input.nextInt();
		
		multiplyTillTen(number);
	}

	
	public static void multiplyTillTen(int number) {
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d x %d = %d\n", number, i, (number * i));
		}
	}
}