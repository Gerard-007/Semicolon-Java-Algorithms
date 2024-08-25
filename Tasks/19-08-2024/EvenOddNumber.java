import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
	
	if(number % 2 == 0){
		System.out.printf("%d is an even number.", number);
	} else {
		System.out.printf("%d is an odd number.", number);
	}
    }
}