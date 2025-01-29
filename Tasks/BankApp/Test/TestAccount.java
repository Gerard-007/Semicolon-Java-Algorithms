import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAccount {
    @Test
    public void testAccount() throws AccountException {
        var Account = new Account("Gerard", "08062134747", "1990");
    }

    @Test
    public void testAccountNumber() throws AccountException {
        var Account = new Account("Gerard", "08062134747", "1990");
        Account.generateAccountNumber("08062134747");
        assertEquals(Account.generateAccountNumber("08062134747"), "8062134747");
    }
}
