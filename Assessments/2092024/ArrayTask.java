public class ArrayTask {
    public static void getLargestElement(int[] array) {
        int largest = array[0];
        for(int i = 0; i < array.length; i++) {
            if (largest < array[i]) largest = array[i];
        }
        System.out.printf("The largest element", largest);
    }

    public static void reverseList(int[] array) {
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int i = array.length; i > 0; i--) {
            newArray[counter] = array[i - 1];
            System.out.printf("%d ", newArray[counter]);
            counter++;
        }
    }

    public static void checkForElementInList(int item, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (item == array[i]) System.out.printf("%d is present in the array", item);
        }
    }

    public static void getOddElements(int[] array) {
        System.out.println("Odd elements");
        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.printf("%d ", array[i]);
            }
        }
    }

    public static void getEvenElement(int[] array) {
        System.out.println("Even elements");
        for(int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.printf("%d ", array[i]);
            }
        }
    }

    public static void getSumOfElements(int[] array) {
        System.out.println("Sum of all elements");
        int sumElement = 0;
        for(int i = 0; i < array.length; i++) {
            sumElement += array[i];
        }
        System.out.printf("%d", sumElement);
    }

    public static void getPalindromeElements(int[] array) {
        for (int num : array) {
            String original = String.valueOf(num);
            String reversed = new StringBuilder(original).reverse().toString();
            if (original.equals(reversed)) {
                System.out.printf("Number %s is a palindrome.\n", original);
            } else {
                System.out.printf("Number %s is not a palindrome.\n", original);
            }
        }
    }

    public static void getSumOfElements(int[] array) {
        System.out.println("Sum of all elements");
        int sumForLoopElement = 0;
        int sumWhileLoopElement = 0;
        int sumDoWhileLoopElement = 0;
        for(int i = 0; i < array.length; i++) {
            sumForLoopElement += array[i];
        }
        System.out.printf("For loop: %d", sumForLoopElement);

        int index = 0;
        while(counter < array.length) {
            sumWhileLoopElement += array[index];
            index++;
        }
        System.out.printf("For while loop: %d", sumWhileLoopElement);

        index = 0;
        do {
            sumDoWhileLoopElement += array[index];
            index++;
        } while(index < array.length);
        System.out.printf("For do while loop: %d", sumDoWhileLoopElement);
    }
}