import java.util.Scanner;

public class VolumeOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of the sides and height of the equilateral triangle:");
		float length = input.nextFloat();
		float area = (float) 1.7321 / 4 * (length * length);
		System.out.printf("The area is: %.2f %n", area);

		float volume = area * length;
		System.out.printf("The volume of the Triangular prism is %.2f", volume);
	}
}