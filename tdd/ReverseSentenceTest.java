import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseSentenceTest {
	@Test
	public void testCanDepositIntoAccount() {
        
		// Given
        	String str = "This is a test";

        	// When
        	ReverseSentence.reverseSentence(str);

        	// Check
        	double balance = account.getBalance();
        	double expectedBalance = 350_000;
        	assertEquals(expectedBalance, balance);
    }
}