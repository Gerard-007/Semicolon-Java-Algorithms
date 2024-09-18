/*
  	write a code that when user types a number wuld tell the user factors of the numbers
	- request a number from user store it as number,
	- declare a counter variable
	- loop through the number
	- get numbers that are divisible by incrementing the count by 1
	- Display the final count.
*/

import java.util.Scanner;

public class NumberFactor {

	public static void main(String... args) {
		Scanner input = new Scanner(System.in);
		int numberVal = input.nextInt();
	
		int counter = 0;

		for(int i = 1; i <= numberVal; i++) {
			if(numberVal % i == 0) {
				counter += 1;
				System.out.println(i);
			}
		}
		System.out.printf("%d", counter);
	}


	public int countFactors(int inputVal) {
		int counter = 0;
		for(int i = 1; i <= inputVal; i++) {
			if(inputVal % i == 0) {
				counter += 1;
			}
		}

		return counter;
	}

}