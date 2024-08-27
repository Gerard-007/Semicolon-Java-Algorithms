import java.util.Scanner;

public class RandomGame {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1 to start or 0 to exit the game: ");
		int randomGuess = input.nextInt();

		while (true) {
			if (randomGuess != 0) {
				playRandomGame(input);
			} else {
				System.out.println("Exiting program...");
			}	
		}
	}

	
	public static int generateRandomNumber() {
		int max = 10;
            	int min = 1;
            	int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;
		return rand;
	}

	
	public static void playRandomGame(Scanner input) {
		int counter = 0;
		int randomNumber = generateRandomNumber();

		System.out.println("Enter an number (1 - 10) to guess: ");
		int randomGuess = input.nextInt();
		
		while (true) {
			if (counter % 3 == 0) {
				randomNumber = generateRandomNumber();
				System.out.println("The random number has changed...");
			}

			if (randomGuess == randomNumber) {
				System.out.printf("Correct! the random number is %d \n", randomGuess);
				break;
			} else {
				if (randomGuess > randomNumber) {
					System.out.println("The number is greater than the random number.");
				} else if (randomGuess < randomNumber) {
					System.out.println("The number is lesser than the random number.");
				} else if (counter == 10) {
					System.out.println("You have exceed your 10 guessing trial Exiting...");
					break;
				}
			}
			counter++;
		}
	}
}