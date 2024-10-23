import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class MenstralApp {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Enter your name: ");
            String username = input.next();
    
            System.out.print("Enter your Age: ");
            int age = input.nextInt();
    
            System.out.print("Enter your last menstral date (dd/mm/yyyy): ");
            String lastMenstralDate = input.next();
    
            System.out.print("Enter the number of your menstral cycle days in total: ");
            int menstralCycleDays = input.nextInt();

            LocalDate formattedLastMenstralDate = LocalDate.parse(lastMenstralDate, formatter);
            LocalDate currentDate = LocalDate.now();
            
            long currentMentralDateCount = ChronoUnit.DAYS.between(formattedLastMenstralDate, currentDate);
            System.out.println(currentMentralDateCount);
            input.close();

            while(true) {
                if(age < 12) {
                    System.out.println("You are still an underage young lady comback when you are 12yrs and above...");
                    break;
                } else {
                    MenstralApp.checkPeriod(currentMentralDateCount, menstralCycleDays);
                }
            }
        }
            catch(Exception e) {
            System.out.printf("""
            Invalid input please follow the example below
            EG:
                - Enter your name: Gerard Nwazk
                - Enter your Age: 400
                - Enter your last menstral date (dd/mm/yyyy): 01/12/1970
                - Enter the number of your menstral cycle days in total: 28
            """);
        }
    }


    public static void checkPeriod(long currentDateCount, int menstralCycleDays) {
        if(menstralCycleDays >= 21 || menstralCycleDays <=35) {
            if(currentDateCount >= 1 && currentDateCount <=5) {
                System.out.printf("You are in your mensuration period, your current date count is %d!\n", currentDateCount);
            } else if(currentDateCount >= 6 && currentDateCount <= 13) {
                System.out.printf("You are in your follicular period, your current date count is %d!\n", currentDateCount);
            } else if(currentDateCount == 14) {
                System.out.printf("You are in your ovulation period, your current date count is %d!\n", currentDateCount);
            } else if(currentDateCount >= 15 && currentDateCount <= 21 || currentDateCount <= 35) {
                System.out.printf("You are in your luteal period, your current date count is %d \n please protect your self during sex at this period\n", currentDateCount);
            }
        } else {
            System.out.println("You need a medical attention!");
        }
    }
}

