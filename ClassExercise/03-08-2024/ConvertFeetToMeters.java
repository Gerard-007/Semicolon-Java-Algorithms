import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        float feet = input.nextFloat();

	float meters = feet * (float) 0.305;
	System.out.printf("%.1f feet is %.3f meters", feet, meters);
    }
}