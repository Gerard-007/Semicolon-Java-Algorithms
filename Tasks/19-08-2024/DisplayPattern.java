public class DisplayPattern {

	public static void main(String[] args) {
		String symbolValA = "";
		String symbolValB = "*";
		int counter = 6;

		for(int i = 0; i < 6; i++) {
			symbolValA += "*";
			System.out.printf("%s \n", symbolValA);
		}

		for(int i = 0; i > 6; i--) {
			symbolValB += counter;
			System.out.printf("%s \n", symbolValB);
			counter --;
		}
	}


}