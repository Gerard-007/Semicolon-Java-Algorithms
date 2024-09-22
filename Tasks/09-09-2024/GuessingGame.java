import java.util.Scanner;

public class GuessingGame {
	
	public static int generateRandomNumber() {
		int max = 1000;
            	int min = 1;
            	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		return rand;
	}

	
	public static void playGuessingGame(Scanner input) {
		int counter = 0;
		int randomNumber = generateRandomNumber();
		while(true) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			if(number == 0) {
				break;
			} else {
				if (number == randomNumber) {
					System.out.println("Congratulations you've won the game.");
					break;
				} else if (number > randomNumber) {
					System.out.println("Thats higher than expected answer!");
				} else if (number < randomNumber) {
					System.out.println("Thats lower than expected answer.");
				}
			}
		}
	}
}