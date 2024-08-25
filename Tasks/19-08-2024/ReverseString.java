import java.util.Scanner;
import java.util.Collections;


public class ReverseString {

	public static void main (String... args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a number or 0 to exit: ");
			String inputVal = input.nextLine();

			if (inputVal == "exit") {
				break;
			} else {
				char[] reverseVal = inputVal.toCharArray();
				for(int i = reverseVal.length - 1; i >= 0; i--) {
					System.out.print(reverseVal[i]);
					
				}
			}
		}
	}

		
}