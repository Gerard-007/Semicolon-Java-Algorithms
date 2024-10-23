import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class MenstralApp {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
             //....   
            }
        }
    }


    public static void checkPeriod(int currentDateCount, int menstralCycleDays) {
        if(menstralCycleDays >= 21 || menstralCycleDays <=35) {
            if(currentDateCount >= 1 && currentDateCount <=5) {
                System.out.printf("You are in your mensuration period!\n");
            } else if(currentDateCount >= 6 && currentDateCount <= 13) {
                System.out.printf("You are in your follicular period!\n");
            } else if(currentDateCount == 14) {
                System.out.printf("You are in your ovulation period!\\n");
            } else if(currentDateCount >= 15 && currentDateCount <= 21 || currentDateCount <= 35) {
                System.out.printf("You are in your luteal period! please protect your self during sex at this period\n");
            }
        } else {
            System.out.println("You need a medical attention!");
        }
    }
}

