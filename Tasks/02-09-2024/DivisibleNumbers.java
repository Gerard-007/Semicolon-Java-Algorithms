public class DivisibleNumbers {
	public static void main(String... args) {
		for(int i = 100; i <= 200; i++) {
			if(i % 3 == 0) {
				if(i % 3 == 0 && i % 4 == 0) {
					continue;
				} else {
					System.out.print(i);
				}
			}
			
			if(i % 4 == 0) {
				if(i % 3 == 0 && i % 4 == 0) {
					continue;
				} else {
					System.out.print(i);
				}
			}
			System.out.print(" ");
			
		}
	}
}