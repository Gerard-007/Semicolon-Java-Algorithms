import java.util.Scanner;
import java.util.Arrays;

public class NumberScores {
	public static void main(String... args) {
		int[] scoreList;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of times to collect scores: ");
		int numberOfScore = input.nextInt();

		if (numberOfScore > 0) {
			scoreList = new int[numberOfScore];
			

			for (int num = 0; num < numberOfScore; num++) {
				System.out.printf("Enter scores num %d: ", num);
				int scoreInput= input.nextInt();
				scoreList[num] = scoreInput;
			}
			System.out.println(Arrays.toString(scoreList));
			

			int largestScore = scoreList[0];
			for (int sc = 0; sc < scoreList.length; sc++) {
				if (largestScore < scoreList[sc]) {
					largestScore = scoreList[sc];
				}
			}
			System.out.printf("Largest Score %d\n", largestScore);
			
			

			int lowestScore = scoreList[0];
			for (int sc = 0; sc < scoreList.length; sc++) {
				if (lowestScore > scoreList[sc]) {
					lowestScore = scoreList[sc];
				}
			}
			System.out.printf("Lowest Score %d\n", lowestScore);
			

			int averageScore = 0;
			for (int sc = 0; sc < scoreList.length; sc++) {
				averageScore += scoreList[sc];
			}
			System.out.printf("Average Score %d\n", averageScore / numberOfScore);
		} else {
			System.out.println("Invalid input please enter a number");
		}
	}
}