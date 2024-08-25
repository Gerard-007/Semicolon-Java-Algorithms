public class TaskFive {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			// System.out.println(i);

			if (i % 4 == 0) {
				for (int x = 1; x <= 5; x++) {
					System.out.printf("%d", i);
				}
				System.out.printf(" ");	
			}
		}
	}
}