public class PalindromicPrime {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 100) {
            if (isPrime(number) && isPalindrome(number)) {
                System.out.print(number + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }

    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int counter = 0;
        for(int i = 1; i <= num; i++) {
            if (i % num == 0) {
                counter++;
            }
        }
        return counter == 2 ? true : false;
    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
			number = number / 10;
        }
        return number == reversed ? true : false;
    }
}
