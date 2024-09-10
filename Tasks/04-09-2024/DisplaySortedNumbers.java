public class DisplaySortedNumbers {
	public static void main(String[] args) {
		displaySortedNumber(30, 43, 32);
	}

	
	public static void displaySortedNumber(double num1, double num2, double num3) {
		int smallestValue = num1;
		if(smallestValue > num2) {
			smallestValue = num2;
		} else if(smallestValue > num3) {
			smallestValue = num3;
		}
		System.out.printf("The smallest value is: ", smallestValue);
	}
}