import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the width:");
		float width = input.nextFloat();

		System.out.print("Enter the height:");
		float height = input.nextFloat();

		calculateArea(width, height);
			
		calculatePerimeter(width, height);
	}

	public static void calculateArea(float width, float height) {
		float area = width * height;
		System.out.printf("The area is: %.2f %n", area);
	}

	public static void calculatePerimeter(float width, float height) {
		float perimeter = 2 * (width + height);
		System.out.printf("The perimeter is: %.2f", perimeter);
	}
}