import java.util.Arrays;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 5, 7, 6};
        System.out.println(Arrays.toString(lowestLargestArray(array)));
    }

    public static int[] lowestLargestArray(int[] array) {
        int largest = array[0];
        int lowest = array[0];
        int [] arrayResult = new int[2];
        for (int i: array) {
            if (largest < i) largest = i;
            if (lowest > i) lowest = i;
        }
        arrayResult[0] = lowest;
        arrayResult[1] = largest;
        return arrayResult;
    }
}