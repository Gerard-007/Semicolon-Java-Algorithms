import java.util.Scanner;


public class Kata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputVal = input.nextInt();

        while (true) {
            System.out.println("Select 1 to check for even numbers");
            if (inputVal == 0) {
                System.out.println("Exiting program.");
                break;
            } else {
                switch (inputVal) {
                    case 1: {
                        System.out.println("Enter a value to check if it's even number.");
                        int isEvenVal = input.nextInt();
                        if (isEven(isEvenVal)) {
                            System.out.println("Is even number");
                        } else {
                            System.out.println("Is odd number");
                        }
                    };
                    break;

                    case 2: {
                        System.out.println("Enter a value to check if it's prime number.");
                        int isEvenVal = input.nextInt();
                        if (isEven(isEvenVal)) {
                            System.out.println("Is even number");
                        } else {
                            System.out.println("Is odd number");
                        }
                    };
                    break;
                }
            }
        }
    }


    public static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }


    public static boolean isPrimeNumber(int number) {
        int count = 0;
        for(int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        return (count == 2) ? true : false;
    }


    public static int subtract(int number1, int number2) {
        int result = number1 - number2;
        return (result % 2 == 0) ? true : false;
    }


    public static float divide(int number1, int number2) {
        if (number2 == 0) {
            return;
        } else {
            int result = number1 / number2;
            return (float) result;
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


    public static boolean isSquare(int number) {
        int squareRoot = (int) Math.sqrt(number);
        return squareRoot * squareRoot == number ? true : false;
    }


    public static long squareOf(int number) {
        int square = number * number;
        return (long)square;
    }

}