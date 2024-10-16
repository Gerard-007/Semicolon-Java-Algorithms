import java.util.Arrays;


public class SortSquaredArray {
	public static void main(String[] args) {
		int[] array = {5, 3, 4};
		System.out.println("Squared list: " + Arrays.toString(sortSquaredArray(array)));
	}


	public static int[] sortSquaredArray(int[] array) {
		int lower = array[0] * array[0];
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
			
		}
		Arrays.sort(result);
		return result;
	}
}