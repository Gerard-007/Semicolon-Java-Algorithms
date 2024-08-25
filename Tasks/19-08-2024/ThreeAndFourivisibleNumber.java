public class ThreeAndFourivisibleNumber {
    public static void main(String[] args) {
		
	for(int i = 100; i <= 1000; i++) {
		if(i % 3 == 0 && i % 4 == 0){
			System.out.printf("%d is divisible by 3 and 4. \n", i);
		}
	}
    }
}