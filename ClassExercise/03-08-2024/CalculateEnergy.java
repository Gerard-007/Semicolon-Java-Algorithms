import java.util.Scanner;

public class CalculateEnergy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in Kg:");
		float amountWater = input.nextFloat();

		System.out.println("Enter the initial temperature:");
		float initialTemperature = input.nextFloat();

		System.out.println("Enter the final temperature:");
		float finalTemperature = input.nextFloat();

		float energy = amountWater * (finalTemperature - initialTemperature) * 4184;

		System.out.printf("The energy needed is: %.1f", energy);
	}
}