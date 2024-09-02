import java.util.Scanner;

public class TaxCalculator {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		float taxRate = input.nextInt();
		float earnings = input.nextInt();
		float totalTax = calculateTax(taxRate, earnings);
		
		System.out.printf("The total calculated tax is: %d \n", totalTax);
	}

		
	public static float calculateTax(float taxRate, float earnings) {
		return (taxRate * earnings) / 100;
	}
}