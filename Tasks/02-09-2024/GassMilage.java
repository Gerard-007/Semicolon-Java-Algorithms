import java.util.Scanner;

public class GassMilage {
	public static void main(String... args) {
		Scanner input = new Scanner(System.in);

		System.out.print("""
			Enter 1 for Single trip
			Enter 2 for Multiple trips
			Enter 0 to exit
			>> 
		""");
		int userInput = input.nextInt();
		
		while (true) {
			if (userInput != 0) {
				switch (userInput) {
					case 0:
					break;
					case 1: {
						System.out.print("Enter miles: ");
						int milesDriven =  input.nextInt();

						System.out.print("Enter gallons: ");
						int gallonsUsed =  input.nextInt();

						int gasMillage = individualGasMillage(milesDriven, gallonsUsed);
						System.out.printf("Gas Millage driven is %d\n", gasMillage);
					}
					break;
					
					case 2: {
						System.out.print("Enter number of trips: ");
						int totalTrips =  input.nextInt();
						int totalMilesDriven = 0;
						int totalGallonsUsed = 0;

						for (int x = 1; x <= totalTrips; x++) {
							System.out.printf("Enter mile driven for trip %d: ", x);
							int milesDriven =  input.nextInt();
							totalMilesDriven += milesDriven;

							System.out.printf("Enter litre gallons for trip %d: ", x);
							int gallonsUsed =  input.nextInt();
							totalGallonsUsed += gallonsUsed;
						}
						System.out.printf("totalMilesDriven: %d, totalGallonsUsed: %d\n", totalMilesDriven, totalGallonsUsed);	
						
						int gasMillage = individualGasMillage(totalMilesDriven, totalGallonsUsed);
						System.out.printf("The Total Gas Millage driven is %d Millage \n", gasMillage);
					}
					break;
					
					default:
					System.out.println("invalid selection...");
					break;
				}
			} else {
				System.out.print("Exiting Program...");
				break;
			}
		}
	}

		
	public static int individualGasMillage(int miles, int gallons) {
		return miles/gallons;
	}
}