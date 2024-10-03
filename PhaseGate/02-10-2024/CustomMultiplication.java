

public class CustomMultiplication {
	
	public static void main(String... args) {
		System.out.printf("%d\n", multiply(3, 0));
		System.out.printf("%d\n", multiply(-3, 4));
		System.out.printf("%d\n", multiply(3, -4));
		System.out.printf("%d", multiply(-3, -4));
	}

	
	public static int multiply(int base, int number) {
		int total = 0;
		if (base == 0 || number == 0)
			return 0;
		if (base < 0) return -multiply(-base, number);
		if (number < 0) return -multiply(base, -number);
		if (base < 0 || number < 0) return multiply(-base, -number);
		
		for (int i = 0; i < number; i++) {
			total += base;
		}
		return total;
	}
}