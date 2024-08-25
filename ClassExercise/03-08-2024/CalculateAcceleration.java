import java.util.Scanner;

public class CalculateAcceleration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0:");
		float startingVeloity = input.nextFloat();
		
		System.out.println("Enter v1:");
		float endingVeloity = input.nextFloat();

		System.out.println("Enter t:");
		float time = input.nextFloat();
		
		float acceleration = (endingVeloity - startingVeloity)/time;

		System.out.printf("Average Acceleration: %.4f", acceleration);
	}
}