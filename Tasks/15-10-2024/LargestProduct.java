import java.util.Arrays;

public class LargestProduct {
    public static void main(String... args) {
        int[] arr = {3, 4, 1, -9, 6};
        largestProductndexes(arr);
    }

    public static void largestProductndexes(int[] arr) {
        int largestProduct = 0;
        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if(arr[i] != arr[j] && arr[i] > 0 && arr[j] > 0) {
                    if (largestProduct < (arr[i] * arr[j])) {
                        largestProduct = arr[i] * arr[j];
                        result[0] = arr[i];
                        result[1] = arr[j];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
