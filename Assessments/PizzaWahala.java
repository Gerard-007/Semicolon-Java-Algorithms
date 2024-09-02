import java.util.Scanner;

public class PizzaWahala {
	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter number of guests: ");
			int numOfGuests = input.nextInt();

			if (numOfGuests != 0) {
				pizzaCheckout(numOfGuests);
			} else {
				System.out.print("Exiting program...");
				break;
			}
		}
	}
	

	public static int calculateNumOfBoxes(int numOfGuests, int numOfSlices) {
		int numberOfBoxes;
		numberOfBoxes = numOfGuests / numOfSlices;
		if (numOfGuests % numOfSlices != 0) {
			numberOfBoxes += 1;
		}	
		return numberOfBoxes;
	}

	
	public static void pizzaCheckout(int numOfGuests) {
		int boxSizes = 0;
		String pizzaType = "";
		float pizzaPrice = 0;
		int numberOfSlices = 0;

		if (numOfGuests <= 4) {
			pizzaType = "Super Size";
			pizzaPrice = 2000;
			numberOfSlices = 4;
			boxSizes = calculateNumOfBoxes(numOfGuests, numberOfSlices);
		} else if (numOfGuests > 4 && numOfGuests <= 6) {
			pizzaType = "Small Money";
			pizzaPrice = 2400;
			numberOfSlices = 6;
			boxSizes = calculateNumOfBoxes(numOfGuests, numberOfSlices);
		} else if (numOfGuests > 6 && numOfGuests <= 8) {
			pizzaType = "Big boys";
			pizzaPrice = 3000;
			numberOfSlices = 8;
			boxSizes = calculateNumOfBoxes(numOfGuests, numberOfSlices);
		} else if (numOfGuests > 8 && numOfGuests >= 12) {
			pizzaType = "Odogwu";
			pizzaPrice = 4200;
			numberOfSlices = 12;
			boxSizes = calculateNumOfBoxes(numOfGuests, numberOfSlices);
		}

		System.out.printf("Required pizza type: %s \n", pizzaType);
		System.out.printf("Number of boxes to buy %d \n", boxSizes);
		System.out.printf("Number of slices %d \n", boxSizes * numberOfSlices);
		System.out.printf("Number of slices left over %d \n", (boxSizes * numberOfSlices) - numOfGuests);
		System.out.printf("Total price N%.2f \n", pizzaPrice * (boxSizes * 1.0));
	}
}