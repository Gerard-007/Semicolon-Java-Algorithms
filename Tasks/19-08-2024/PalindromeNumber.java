import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int number = input.nextInt();


		if(number < 100 || number > 999){
			System.out.println("Please enter a valid 3 digit number");
		} else {
			int digit1 = number / 100;
				int digit2 = number % 10;

				if (digit1 == digit2) {
						System.out.printf("%d is a palindrome.", number);
				} else {
						System.out.printf("%d is not a palindrome.", number);
				}
		}

		// String manu = """
        //     Welcome to Nokia 3310
        //     Please select the below menu to start...
        //     1: Phone Book
        //     2: Messages
        //     3: Chat
        //     4: Call register
        //     5: Tone
        //     6: Settings
        //     7: Call divert
        //     8: Games
        //     9: Calculator
        //     10: Reminder
        //     11: Clock
        //     12: Profiles
        //     13: SIM services
        //     0: Exit
        //     >> """;

		// System.out.print(manu);
    }


	// public static boolean isPalindrome(int number) {
	// 	if (number < 10000 || number > 99999) {
	// 		return false;
	// 	}

	// 	int firstNum = number / 10000;
	// 	int secondNum = (number / 1000) % 10;
	// 	int fourthNum = (number / 10) % 10;
	// 	int fifthNum = number % 10;
	// 	// System.out.printf("%d %d %d %d", firstNum, secondNum, fourthNum, fifthNum);

	// 	return firstNum == fifthNum && secondNum == fourthNum;
	// }

	


	
}