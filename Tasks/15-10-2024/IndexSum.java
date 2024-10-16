import java.util.Arrays;

public class IndexSum {
    public static void main(String... args) {
        int[] arr = {3, 4, 1, 9, 6};
        sumIndexes(arr);
    }

    public static void sumIndexes(int[] arr) {
        int sum = 15;
        int[] result = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
		    result[0] = arr[i];
		    result[1] = arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}