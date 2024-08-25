public class TaskSix {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			// System.out.println(i);

			if (i % 4 == 0) {
				// System.out.printf("%d %d %d %d %d ", i, i*i, i*i*i, i*i*i*i, i*i*i*i*i);
				
				int startResult = 1;
				int base = i;
				int exponent = 5;
    
    				for (int x = 1; x <= exponent; x++) {
        				startResult *= base;
        				System.out.printf("%d ", startResult);
    				}
			}
			System.out.printf(" ");
		}
	}
}