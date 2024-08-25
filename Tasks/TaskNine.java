public class TaskNine {
	public static void main(String[] args) {

		int squaredNumbers = 0;

		for(int i = 1; i <= 10; i++) {

			if (i % 4 == 0) {
				int startResult = 1;
				int base = i;
				int exponent = 5;
    
    				for (int x = 1; x <= exponent; x++) {
        				startResult *= base;
					squaredNumbers += startResult;
    				}	
			}
		}
		squaredNumbers *= squaredNumbers;
		System.out.printf("%d ", squaredNumbers);
	}
}