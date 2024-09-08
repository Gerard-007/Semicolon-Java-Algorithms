public class ReversedInteger {
    	public static void main(String[] args) {
        	reverse(2345);
    	}

    	public static void reverse(int number) {
        	int reversed = 0;

        	while (number != 0) {
            		int remainder = number % 10;

            		reversed = reversed * 10 + remainder;
					System.out.printf("reversed: %d\n", reversed);
 
					number = number / 10;
					System.out.printf("number: %d\n", number);    
		}

        	System.out.printf("Reversed number = %d\n", reversed);
    	}
}
