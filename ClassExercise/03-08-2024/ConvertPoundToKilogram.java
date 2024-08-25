import java.util.Scanner;

public class ConvertPoundToKilogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in pounds: ");
        float pounds = input.nextFloat();

	float kilograms = pounds * (float) 0.454;
	System.out.printf("%.1f pounds is %.3f kilograms", pounds, kilograms);
    }
}