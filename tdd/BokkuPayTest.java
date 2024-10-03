import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BokkuPayTest {
    @Test // annotation
    public void testCanDepositIntoAccount() {
        // Given
        double amountToDeposit = 350_000;
        Account account = new Account();

        // When
        account.deposit(amountToDeposit);

        // Check
        double balance = account.getBalance();
        double expectedBalance = 350_000;
        assertEquals(expectedBalance, balance);
    }


    @Test
    public void testNegativeAmount() {
        //Given
        double amountToDeposit = -100_000;
        Account account = new Account();

        //Combine Check with When
        assertThrows(IllegalArgumentException.class, () -> account.deposit(amountToDeposit));
    }

    @Test
    public void testCanTransferFunds() {
        // Given
        double amountToDeposit = 100_000;
        Account sender = new Account();
        Account recipient = new Account();
        double initialRecipientBalance = recipient.getBalance();
        System.out.printf("Initial balance: %f\n", initialRecipientBalance);
        sender.deposit(amountToDeposit);

        // When
        double amountToTransfer = 20_000;
        System.out.printf("Transfer amount: %f\n", amountToTransfer);
        sender.transferFunds(amountToTransfer, recipient);

        // Check
        double currentRecipientBalance = recipient.getBalance() - initialRecipientBalance;
        System.out.printf("Current balance: %f\n", currentRecipientBalance);
        assertEquals(amountToTransfer, currentRecipientBalance);
    }

    @Test
    public void senderHasFund() {
        // Given
        double amountToDeposit = 10_000;
        Account sender = new Account();
        Account recipient = new Account();
        sender.deposit(amountToDeposit);

        // When
        double amountToTransfer = 20_000;

        // Check that sender cant send more than what they have in their account
        assertThrows(IllegalArgumentException.class, () -> sender.transferFunds(amountToTransfer, recipient));
    }
}