import java.util.Scanner;

public class KataRunner {
    	public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);

		

        	while (true) {
			System.out.print("""
			Select 1 to check for even numbers
			Select 2 to subtract numbers
			Select 3 to divide numbers
			Select 4 to check for prime number
			Select 5 to count the factors of a number
			>> """);
        		int inputVal = input.nextInt();

			if (inputVal == 0) {
                		System.out.println("Exiting program...");
                		break;
            		}

                	switch (inputVal) {
				case 0:
					System.out.println("Exiting...");
					break;

                    		case 1: {
					System.out.println(">> Check for even number");
                        		System.out.print("Enter a value: ");
                        		int userInput = input.nextInt();

                        		if (Kata.isEven(userInput)) {
                            			System.out.println("<< Is even number >>");
                        		} else {
                            			System.out.println("<< Is odd number >>");
                        		}
					System.out.println();
                    		};
                    		break;

				case 2:{
					System.out.println(">> Subract numbers");
					System.out.print("Enter the first number: ");
					int firstNumber = input.nextInt();
				
					System.out.print("Enter the second number: ");
					int secondNumber = input.nextInt();

					int result = Kata.subtract(firstNumber, secondNumber);
					System.out.printf("The result is %d \n", result);
					
					System.out.println();
				}
				break;

				case 3: {
					System.out.println(">> Check for zero dividend");
					System.out.print("Enter the first number: ");
					int firstNumber = input.nextInt();
				
					System.out.print("Enter the second number: ");
					int secondNumber = input.nextInt();

					float result = Kata.divide(firstNumber, secondNumber);
					if(result != 0) {
						System.out.printf("The result is %f \n", result);
					} else {
						System.out.println("Error! cannot divide number with zero");
					}
					
					System.out.println();
				}
				break;

				case 4: {
					System.out.println(">> Check for prime number");
					System.out.print("Enter a number: ");
					int number = input.nextInt();
					if (Kata.isPrimeNumber(number)) {
						System.out.println("<< Is a prime number >>");
					} else {
						System.out.println("<< Is not a prime number >>");
					}
					System.out.println();
				}
				break;

				case 5: {
					System.out.println(">> Count the factors of a number");
					System.out.print("Enter a number: ");
					int number = input.nextInt();
					
					int factorCount = Kata.factorOf(number);

					System.out.printf("%d has %d factor(s)\n", number, factorCount);
					System.out.println();
				}
				break;
                	}
        	}
	}
}

