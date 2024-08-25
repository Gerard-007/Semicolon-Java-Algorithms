import java.util.Scanner;

public class PrimeNumber {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
	
		int counter = 0;

		int numberVal = input.nextInt();

		for(int i = 1; i <= numberVal; i++) {
			if(numberVal % i == 0) {
				counter += 1;
				if (counter <= 2) {
					System.out.println(i);
					System.out.printf("%d is a prime number", numberVal);
				}
			}
		}
	}

}