public class MultiplicationTable {
	public static void main(String... args) {
		for (int h = 1; h <= 9; h++) {
			multiplyTillNine(h);
		}
	}
	

	public static void multiplyTillNine(int number) {
		for(int i = 1; i <= number; i++) {
			System.out.printf("%d * %d = %d \t", number, i, number*i );
		}
		System.out.print("");
	}
}