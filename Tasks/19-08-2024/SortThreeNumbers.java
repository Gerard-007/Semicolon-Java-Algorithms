import java.util.Scanner;
import java.util.ArrayList;


public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int numberCount = 0;
	ArrayList<Integer> numberList = new ArrayList<Integer>();
	ArrayList<Integer> sortedNumberList = new ArrayList<Integer>();
	
	while (numberCount < 3) {
		System.out.println("Enter a number");
		int numberValue = input.nextInt();
		numberList.add(numberValue);
		numberCount++;
	}
	
	int firstNumber = 0;
	
	for(int i = 0; i < numberList.size(); i++) {
		System.out.println(numberList[i]);
		if(firstNumber < numberList[i]) {
			firstNumber = i;
			sortedNumberList.add(firstNumber);
		}
	}
	
	System.out.println(sortedNumberList);
    }
}