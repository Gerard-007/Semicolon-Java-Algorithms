import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius:");
		float radius = input.nextFloat();

		calculateArea(radius);
			
		calculatePerimeter(radius);
	}

	public static void calculateArea(float radius) {
		float area = radius * radius * (float) 3.14159;
		System.out.printf("The area is: %.2f %n", area);
	}

	public static void calculatePerimeter(float radius) {
		float perimeter = 2 * radius * (float) 3.14159;
		System.out.printf("The perimeter is: %.2f", perimeter);
	}

}