import java.util.Arrays;


public class SortSquaredArray {
	public static void main(String[] args) {
		int[] array = {5, 3, 4};
		sortSquaredArray(array);
		//System.out.println(Arrays.toString(sortSquaredArray(array)));
	}

	
	public static void sortSquaredArray(int[] array) {
        int n = array.length;
        int[] result = new int[n];  // Result array to store sorted squares
        int left = 0;  // Pointer to the leftmost (smallest) element
        int right = n - 1;  // Pointer to the rightmost (largest) element
        int index = n - 1;  // Position to insert the largest squared value

        while (left <= right) {
            int leftSquared = array[left] * array[left];  // Square of the left element
            int rightSquared = array[right] * array[right];  // Square of the right element

            // Compare the squared values
            if (leftSquared > rightSquared) {
                result[index] = leftSquared;
                left++;
            } else {
                result[index] = rightSquared;
                right--;
            }
            index--;  // Move towards the left in the result array
        }

        // Print the sorted result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}