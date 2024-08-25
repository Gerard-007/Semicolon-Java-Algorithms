import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        float weight = input.nextFloat();
	float weightPound = weight * (float) 0.45359237;

        System.out.println("Enter height in inches: ");
        float height = input.nextFloat();
	float heightInch = height * (float) 0.0254;

	float BMI = weightPound / (heightInch * heightInch);
	System.out.printf("BMI is %.4f", BMI);
    }
}