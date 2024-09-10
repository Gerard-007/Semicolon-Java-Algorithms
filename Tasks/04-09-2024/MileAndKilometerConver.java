public class MileAndKilometerConverter {
	public static void main(String[] args) {
		
		mileToKilometer(4);

		kilometerToMile(3);
	}

	
	public static double mileToKilometer(double number) {
		return 1.609344 * number;
	}
	
	public static double kilometerToMile(double number) {
		return 0.62137119 * number;
	}
}