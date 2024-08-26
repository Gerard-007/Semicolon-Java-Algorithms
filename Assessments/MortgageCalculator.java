import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term in years: ");
        int loanTermYears = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int numberOfPayments = loanTermYears * 12;

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        System.out.printf("The monthly payment is NGN%.2f%n", monthlyPayment);
    }
}
