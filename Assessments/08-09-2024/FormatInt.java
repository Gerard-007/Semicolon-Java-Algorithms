import java.util.Scanner;

public class FormatInt {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        System.out.println("Formatted number: " + formatInt(number, width));
    }


    public static String formatInt(int number, int width) {
        String numStr = Integer.toString(number);

        if (numStr.length() >= width) {
            return numStr;
        }

        StringBuilder convertedInt = new StringBuilder();

        for (int i = 0; i < width - numStr.length(); i++) {
            convertedInt.append('0');
        }

        convertedInt.append(numStr);

        return convertedInt.toString();
    }
}
