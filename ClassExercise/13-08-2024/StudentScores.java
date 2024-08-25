import java.util.Scanner;

public class StudentScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int scoreData = input.nextInt();

		if(scoreData >= 50){
			System.out.println("The student passed.");
		} else {
			System.out.println("The student failed.");
		}
	}
}