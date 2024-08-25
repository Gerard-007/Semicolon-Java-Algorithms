import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance: ");
        float balance = input.nextFloat();

        System.out.println("Enter interest rate: ");
        float interestRate = input.nextFloat();

	float interest = balance * (interestRate / 1200);
	System.out.printf("The interest is %.5f", interest);
    }
}