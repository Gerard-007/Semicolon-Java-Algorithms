import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class MenstrualApp {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Enter your name: ");
            String username = input.next();
    
            System.out.print("Enter your Age: ");
            int age = input.nextInt();
    
            if (age < 12) {
                System.out.println("You are still an underage young lady, come back when you are 12 years and above...");
                return; // Exit the program if age is less than 12
            }

            System.out.print("Enter your last menstrual date (dd/MM/yyyy): ");
            String lastMenstrualDate = input.next();
    
            System.out.print("Enter the number of your menstrual cycle days in total: ");
            int menstrualCycleDays = input.nextInt();

            LocalDate formattedLastMenstrualDate = LocalDate.parse(lastMenstrualDate, formatter);
            LocalDate currentDate = LocalDate.now();
            
            long currentMenstrualDateCount = ChronoUnit.DAYS.between(formattedLastMenstrualDate, currentDate);

            MenstrualApp.checkPeriod(username, currentMenstrualDateCount, menstrualCycleDays);
        } catch (Exception e) {
            System.out.printf("""
            Invalid input. Please follow the example below to input your details:
            EG:
                - Enter your name: Geraldine Nwazk
                - Enter your Age: 24
                - Enter your last menstrual date (dd/MM/yyyy): 01/12/2020
                - Enter the number of your menstrual cycle days in total: 28
            """);
        } finally {
            input.close();
        }
    }

    public static void checkPeriod(String username, long currentDateCount, int menstrualCycleDays) {
        if (menstrualCycleDays >= 21 && menstrualCycleDays <= 35) {
            if (currentDateCount >= 1 && currentDateCount <= 5) {
                System.out.printf("Hy %s you are in your menstrual period, your current date count is %d!\n", username, currentDateCount);
            } else if (currentDateCount >= 6 && currentDateCount <= 13) {
                System.out.printf("Hy %s you are in your follicular period, your current date count is %d!\n", username, currentDateCount);
            } else if (currentDateCount == 14) {
                System.out.printf("Hy %s you are in your ovulation period, your current date count is %d!\n", username, currentDateCount);
            } else if (currentDateCount >= 15 && currentDateCount <= 35) {
                System.out.printf("Hy %s you are in your luteal period, your current date count is %d.\nPlease protect yourself during sex at this period.\n", username, currentDateCount);
            }
        } else {
            System.out.println("You need medical attention!");
        }
    }
}
