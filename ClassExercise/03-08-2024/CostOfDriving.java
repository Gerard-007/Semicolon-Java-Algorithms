import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        float distance = input.nextFloat();

	System.out.println("Enter the miles per gallon: ");
        float mile = input.nextFloat();

	System.out.println("Enter the price per gallon: ");
        float price = input.nextFloat();

	float distancePrice = distance * price;

	float cost = distancePrice / mile;
	System.out.printf("The cost of driving is $%.4f", cost);
    }
}