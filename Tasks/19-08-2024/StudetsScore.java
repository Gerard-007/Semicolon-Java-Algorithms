import java.util.Scanner;

public class StudetsScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a student score: ");
        int scoreValue = input.nextInt();
	
	if(scoreValue > 60){
		System.out.printf("%d You passed the exam.", scoreValue);
	} else {
		System.out.printf("%d You failed the exam.", scoreValue);
	}
    }
}