import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;

        int numberOfMonths = numberOfYears * 12;

        double futureInvestmentValue = investmentAmount;
        for (int i = 0; i < numberOfMonths; i++) {
            futureInvestmentValue *= (1 + monthlyInterestRate);
        }

        System.out.printf("Accumulated value is $%.2f", futureInvestmentValue);
    }
}