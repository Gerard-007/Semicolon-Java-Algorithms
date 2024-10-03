import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 3, 5};
        System.out.println("Sum of all list: " + Arrays.toString(getMaximumSize(array)));
        System.out.println("Lowest and largest elements: " + Arrays.toString(lowestLargestArray(getMaximumSize(array))));
        System.out.println("Squared list: " + Arrays.toString(sortedSquareList(array)));
    }


    public static int[] getMaximumSize(int[] array) {
        int number;
        int counter;
        int sumList;
        int[] copy = new int[array.length - 1];
        int[] finalCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            number = array[i];
            counter = 0;
            sumList = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] != number) {
                    copy[counter] = array[j];
                    counter++;
                }
            }

            for(int k = 0; k < copy.length; k++) {
                sumList += copy[k];
            }
            finalCopy[i] = sumList;
        }
        return finalCopy;
    }


    public static int[] lowestLargestArray(int[] array) {
        int[] largestLowest = new int[2];
        int largestNum = array[0];
        int lowestNum = array[0];

        for (int w = 0; w < array.length; w++) {
            if(largestNum < array[w]) {
                largestNum = array[w];
            }
            if(lowestNum > array[w]) {
                lowestNum = array[w];
            }
        }
        largestLowest[0] = lowestNum;
        largestLowest[1] = largestNum;

        return largestLowest;
    }


    public static int[] sortedSquareList(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }
}