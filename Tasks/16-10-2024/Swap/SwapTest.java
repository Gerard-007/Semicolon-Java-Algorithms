import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import javax.crypto.IllegalBlockSizeException;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwapTest {
    @Test
    public void testThatClassAndMethodExists() {
        // Given
        int[] array = {1, 2, 3, 4, 5, 6};
        Swap newSwap = new Swap();

        // When
        newSwap.tapSwap(array);
    }

    @Test
    public void testCanSwapArrayByTwoDigits() {
        // Given
        int[] array = {1, 2, 3, 4, 5, 6};
        Swap newSwap = new Swap();
        int[] expected = {2, 1, 4, 3, 6, 5};

        // When
        newSwap.tapSwap(array);

        // Check
        assertArrayEquals(expected, array);
    }
}
