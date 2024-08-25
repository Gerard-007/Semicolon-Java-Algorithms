import java.util.Scanner;



public class DisplayPatternLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
		 System.out.print(' ');
            }
            System.out.println();
        }
        
        System.out.println();



        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
		System.out.print(' ');
            }
            System.out.println();
        }
        
        System.out.println();

    }
}

