import java.util.Scanner;

public class MainProgram {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("""
		Enter 1 to start guessing game
		Enter 2 to beutify string
		Enter 0 to exit the program
		>> """);

		int option = input.nextInt();

		switch (option) {
			case 0:
				break;
			case 1:
				GuessingGame.playGuessingGame(input);
				break;
			case 2:	{
				input.nextLine();
                		System.out.println("Enter your strings...");
                		String userInput = input.nextLine();               		
				String result = BeautifyString.beautifyUserInput(userInput);
                		System.out.println(result);
                		break;
			}
			default:
				System.out.println("Select a valid option.");
				break;
		}
	}
}