import java.util.Scanner;

public class LogisticService {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.print("Enter numbers of successful delivery: ");
			int collectionRateInput = input.nextInt();

			if (collectionRateInput != 0) {
				calculateTotalAmount(collectionRateInput);
			} else {
				System.out.print("Exiting program...");
				break;
			}
		}
	}


	public static void calculateTotalAmount(int collectionRate) {
		float basePay = 5000;
		float totalAmountPerParcel = 0;

		if (collectionRate < 50) {
			totalAmountPerParcel = (160 * collectionRate) + basePay;
			System.out.printf("N%.2f is your payment for %d successful delivery.\n", totalAmountPerParcel, collectionRate);
		} else if (collectionRate >= 50 && collectionRate <= 59) {
			totalAmountPerParcel = (200 * collectionRate) + basePay;
			System.out.printf("N%.2f is your payment for %d successful delivery.\n", totalAmountPerParcel, collectionRate);
		} else if (collectionRate >= 60 && collectionRate <= 69) {
			totalAmountPerParcel = (250 * collectionRate) + basePay;
			System.out.printf("N%.2f is your payment for %d successful delivery.\n", totalAmountPerParcel, collectionRate);
		} else if (collectionRate >= 70) {
			totalAmountPerParcel = (500 * collectionRate) + basePay;
			System.out.printf("N%.2f is your payment for %d successful delivery.\n", totalAmountPerParcel, collectionRate);
		}
	}
}