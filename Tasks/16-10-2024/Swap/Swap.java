import java.util.Arrays;
import javax.crypto.IllegalBlockSizeException;

public class Swap {
    public static void main(String... args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        Swap newSwap = new Swap();
        System.out.println(Arrays.toString(newSwap.tapSwap(array)));
    }

    public int[] tapSwap(int[] array) {
        int temp;
        int[] result = new int[array.length];
        if (array.length % 2 != 0) {
        } else {
            for (int i = 0; i < array.length; i+=2) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                result[i] = array[i];
                result[i + 1] = array[i + 1];
            }
        }
        return result;
    }
}
