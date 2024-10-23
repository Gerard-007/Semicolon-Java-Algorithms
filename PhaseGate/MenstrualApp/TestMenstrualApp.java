import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMenstrualApp {
    String name = "Geraldine";

    @Test
    public void testCheckMenstrualPeriod() {
        long currentDateCount = 3;
        int menstrualCycleDays = 28;
        assertEquals(MenstrualApp.checkPeriod(this.name, currentDateCount, menstrualCycleDays), "Hy Geraldine you are in your menstrual period, your current date count is 3!");
    }

    @Test
    public void testCheckFollicularPeriod() {
        long currentDateCount = 10;
        int menstrualCycleDays = 28;
        assertEquals(MenstrualApp.checkPeriod(this.name, currentDateCount, menstrualCycleDays), "Hy Geraldine you are in your follicular period, your current date count is 10!");
    }

    @Test
    public void testCheckOvulationPeriod() {
        long currentDateCount = 14;
        int menstrualCycleDays = 28;
        assertEquals(MenstrualApp.checkPeriod(this.name, currentDateCount, menstrualCycleDays), "Hy Geraldine you are in your ovulation period, your current date count is 14!");
    }

    @Test
    public void testCheckLutealPeriod() {
        long currentDateCount = 20;
        int menstrualCycleDays = 28;
        assertEquals(MenstrualApp.checkPeriod(this.name, currentDateCount, menstrualCycleDays), "Hy Geraldine you are in your luteal period, your current date count is 20. Please protect yourself during sex at this period.");
    }

    @Test
    public void testCheckForMedicalAttention() {
        long currentDateCount = 10;
        int menstrualCycleDays = 20;
        assertEquals(MenstrualApp.checkPeriod(this.name, currentDateCount, menstrualCycleDays), "Hy Geraldine you need medical attention!");
    }
}
