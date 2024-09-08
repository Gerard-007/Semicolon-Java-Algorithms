public class DecreasingOrder {
    public static void main(String[] args) {
        displaySortedNumbers(23, 13, 21);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double lowestNumber;

        if (num1 > num2) {
            lowestNumber = num1;
            num1 = num2;
            num2 = lowestNumber;
        }

        if (num1 > num3) {
            lowestNumber = num1;
            num1 = num3;
            num3 = lowestNumber;
        }

        if (num2 > num3) {
            lowestNumber = num2;
            num2 = num3;
            num3 = lowestNumber;
        }

        System.out.printf("%.2f %.2f %.2f\n", num1, num2, num3);
    }
}
