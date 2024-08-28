public class Kata {

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }


    public static boolean isPrimeNumber(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        return (count == 2) ? true : false;
    }


    public static int subtract(int number1, int number2) {
	int highestNum = number1;
	int result = 0;
	if (highestNum < number2) {
	    highestNum = number2;
	    result = highestNum - number1;
	} else {
	    result = highestNum - number2;
	}
	return result;
    }


    public static float divide(int number1, int number2) {
        if (number2 == 0) {
            return 0;
        } else {
            float result = (number1*1.0) / (number2*1.0);
            return result;
        }
    }


    public static int factorOf(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                counter += 1;
            }
        }
        return counter;
    }


    public static boolean isPalindrome(int number) {
        if (number < 10000 || number > 99999) {
            return false;
        }

        int firstNum = number / 10000;
        int secondNum = (number / 1000) % 10;
        int fourthNum = (number / 10) % 10;
        int fifthNum = number % 10;

        return firstNum == fifthNum && secondNum == fourthNum;
    }


    public static boolean isSquare(int number) {
        int squareRoot = (int) Math.sqrt(number);
        return squareRoot * squareRoot == number;
    }


    public static long squareOf(int number) {
        int square = number * number;
        return (long)square;
    }

}