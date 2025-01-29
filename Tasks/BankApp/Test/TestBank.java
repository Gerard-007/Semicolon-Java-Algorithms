import org.junit.Test;

public class TestBank {
    @Test
    public void testBank() {
        var Genas = new Bank("Genas MCFB");
        Genas.getName();

        Genas.registerAccount("Gerard", "08062134747", "1990");

        Genas.getAccount("8062134747");

        Genas.deposit("8062134747", 5000.00);

        Genas.withdraw("8062134747", 5000.00, "1990");

        Genas.transfer("8062134747", "8186612324", 5000.00, "1990");
    }
}
