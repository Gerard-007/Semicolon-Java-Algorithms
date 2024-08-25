import java.util.Scanner;

public class FindRunwayLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter speed");
		double speed = input.nextDouble();

		System.out.println("Enter acceleration");
		double acceleration = input.nextDouble();
		
		double speedSquared = speed * speed;

		double length = speedSquared / (2 * acceleration);
		
		System.out.printf("Length: %.3f", length);
	}
}