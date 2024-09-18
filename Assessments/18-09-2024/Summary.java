import java.util.Scanner;

public class Summary {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int sumNumber = 0;
        int evenNumber = 0;
        int evenScore = 0;
        int evenScoreCounter = 0;
        int validScores = 0;

        for(int num = 0; num < 10; num++){
            System.out.printf("Enter score (%d): ", num);
            int number = input.nextInt();
            sumNumber += number;
        }
        System.out.printf("Total Score: %d\n", sumNumber);
        System.out.printf("Average: %d\n", sumNumber/10);

        for(int num = 1; num <= 10; num++){
            System.out.printf("Enter another score (%d): ", num);
            int number = input.nextInt();
            if (num % 2 == 0) {
                evenNumber += number;
            }

            if (number % 2 == 0) {
                evenScore += number;
                evenScoreCounter += 1;
            }
        }
        System.out.printf("Total sum even indexes: %d\n", evenNumber);
        System.out.printf("Total sum even scores: %d\n", evenScore);
        System.out.printf("Average of sum even scores: %d\n", evenScore/evenScoreCounter);

        for(int num = 1; num <= 10; num++){
            System.out.printf("Enter another score (%d): ", num);
            int number = input.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Invalid input allowed enter from 0 to 100.");
            } else {
                validScores += number;
            }
        }
        System.out.printf("Total valid scores: %d\n", validScores);
    }
}