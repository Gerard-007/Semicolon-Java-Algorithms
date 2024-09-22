public class Array {

    public static void getLargestElement(int[] array) {
        int largestNumber = array[0];
        for(int i = 0; i < array.length; i++) {
            if(largestNumber < array[i]) {
                largestNumber = array[i];
            }
        }
        System.out.printf("The largest number is %d\n", largestNumber);
    }

    public static void reverseList(int[] array) {
        int[] copy = new int[array.length];
        int counter = 0;
        for (int i = array.length; i > 0; i--) {
            copy[counter] = array[i - 1];
            counter++;
        }
        for (int num: copy) {
            System.out.printf("%d", num);
        }
    }

    public static void getExistingElements(int[] array) {
        int duplicate = 0;
        for(int i = 0; i < array.length; i++) {
            duplicate = array[i];
            int counter = 0;
            for(int j = 0; j < array.length; j++) {
                if(duplicate == array[j]) counter++;
            }
            if(counter > 2) {
                System.out.printf("%d occured more than twice in the list.\n", duplicate);
            }
        }
    }

    public static void getOddElements(int[] array) {
        System.out.println("Elements in odd position...");
        for(int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", array[i]);
            }
        }
    }

    public static void getEvenElements(int[] array) {
        System.out.println("Elements in even position...");
        for(int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d ", array[i]);
            }
        }
    }

    public static void getTotalElements(int[] array) {
        System.out.println("Total Elements...");
        int sumArray = 0;
        for(int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        System.out.println(sumArray);
    }

    public static void getPalindromeElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String originalVal = String.valueOf(array[i]);
            String reversedVal = new StringBuilder(originalVal).reverse().toString();
            
            if (originalVal.equals(reversedVal)) {
                System.out.printf("Number %s is a palindrome.\n", originalVal);
            } else {
                System.out.printf("Number %s is not a palindrome.\n", originalVal);
            }
        }
    }
    
    public static void joinList() {}

    public static void alternatingList() {}

    public static void convertDigitsToList() {}
}