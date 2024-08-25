import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter the point X1: ");
	double pointX1 = input.nextDouble();
		
	System.out.print("Enter the point X2: ");
	double pointX2 = input.nextDouble();
		
	System.out.print("Enter the point X3: ");
	double pointX3 = input.nextDouble();
		
	System.out.print("Enter the point Y1: ");
	double pointY1 = input.nextDouble();
		
	System.out.print("Enter the point Y2: ");
	double pointY2 = input.nextDouble();
		
	System.out.print("Enter the point Y3: ");
	double pointY3 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow((pointX2 - pointX1), 2) + Math.pow((pointY2 - pointY1), 2));
        double side2 = Math.sqrt(Math.pow((pointX3 - pointX2), 2) + Math.pow((pointY3 - pointY2), 2));
        double side3 = Math.sqrt(Math.pow((pointX1 - pointX3), 2) + Math.pow((pointY1 - pointY3), 2));

        double sumSide = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(sumSide * (sumSide - side1) * (sumSide - side2) * (sumSide - side3));

        System.out.printf("The area of the triangle is: %.2f %n", area);
    }
}