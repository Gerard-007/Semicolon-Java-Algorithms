import java.util.Scanner;


public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int firstCount = 0;

	while(true) {
		System.out.print("Enter a student score: ");
		int initialCount = input.nextInt();

		if (initialCount != 0) {
			if (firstCount < initialCount) {
				firstCount = initialCount;
			}
			System.out.printf("highest number is %d \n", firstCount);
		} else {
			break;
		}
	}
    }
}