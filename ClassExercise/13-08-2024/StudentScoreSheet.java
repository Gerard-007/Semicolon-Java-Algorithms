import java.util.Scanner;

public class StudentScoreSheet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scoreCount = 0;
		int numPassed = 0;
		int numFailed = 0;

		/**
		while (scoreCount < 10) {
			System.out.print("Enter a student pass mark: ");
			int scoreData = input.nextInt();
			if(scoreData >= 50){
				System.out.println("The student passed.");
			} else {
				System.out.println("The student failed.");
			}
			scoreCount++;
		} */

		for (int x = 0; x < 10; x++) {
			System.out.print("Enter a student pass mark: ");
			int scoreData = input.nextInt();

			if(scoreData >= 50){
				System.out.println("The student passed.");
				numPassed++;
			} else {
				System.out.println("The student failed.");
				numFailed++;
			}
		}
		
		System.out.printf("%d students passed. \n", numPassed);
		System.out.printf("%d students failed. \n", numFailed);
	}
}