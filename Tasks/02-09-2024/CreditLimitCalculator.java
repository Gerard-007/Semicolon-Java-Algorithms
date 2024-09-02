import java.security.SecureRandom;


public class CreditLimitCalculator {
	public static void main(String... args) {
		SecureRandom randomNumber = new SecureRandom();
		int account = 10000000 + randomNumber.nextInt(99999999);
		System.out.printf("Account: %d", account);

		int beginningBalance = 0;
		int totalItemCharged = 0;
		int totalCreditsApplied = 0;
		
		int newBalance = calculateNewBalance(beginningBalance, totalItemCharged, totalCreditsApplied);
		System.out.printf("New Balance %d", newBalance);
	}

	
	public static int calculateNewBalance(int beginningBalance, int totalItemCharged, int totalCreditsApplied) {
		return (beginningBalance + totalItemCharged) - totalCreditsApplied;
	}
}