import java.util.Scanner;
import java.util.ArrayList;

public class NumberToWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter a number between 1 to 10 only");
			int inputNum = input.nextInt();

			switch (inputNum) {
		
				case 1:
    					System.out.println("one");
    					break;
				case 2:
    					System.out.println("Two");
    					break;
				case 3:
    					System.out.println("Three");
    					break;
				case 4:
    					System.out.println("Four");
    					break;
				case 5:
    					System.out.println("Five");
    					break;
				case 6:
    					System.out.println("Six");
    					break;
				case 7:
    					System.out.println("Seven");
    					break;
				case 8:
    					System.out.println("Eight");
    					break;
				case 9:
    					System.out.println("Nine");
    					break;
				case 10:
    					System.out.println("Ten");
    					break;
  				default:
    					System.out.println("Enter a valid number from 1 to 10 only!");
			}
		}

		catch(Exception e) {
			System.out.println("That is not a valid number please enter a valid number from 1 to 10 only!");
		}
		
		
	}

}