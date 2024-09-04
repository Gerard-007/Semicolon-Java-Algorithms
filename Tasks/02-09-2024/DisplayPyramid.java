public class DisplayPyramid {

	public static void main(String[] args) {
		String symbolValB = "*";
		int counter = 6;

		for(int i = 0; i > 6; i--) {
			symbolValB += counter;
			System.out.printf("%s \n", symbolValB);
			counter --;
		}
	}


}