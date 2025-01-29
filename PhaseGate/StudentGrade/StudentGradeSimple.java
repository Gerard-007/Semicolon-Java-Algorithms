import java.util.Scanner;
import java.util.Arrays;


public class StudentGradeSimple {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the number of students");
        int numberOfStudent = scanner.nextInt();

        System.out.println("What is the number of subjects");
        int numberOfSubject = scanner.nextInt();

        int[][] subjects = new int[numberOfStudent][numberOfSubject];

        String[] students = new String[numberOfStudent];

        for(int i = 0; i < numberOfStudent; i++) {
            System.out.println("Enter the name of student " + i+1);
            String student = scanner.next();
            System.out.println(student);
            /*
            for(int j = 0; j < numberOfSubject; j++) {
                System.out.println("Enter score for subject" + j+1);
                int score = scanner.nextInt();
                if (score >= 0 && score <= 100) {
                    subjects[i][j] = score;
                }
            }
            students[i] = student;
            */
        }

        // 5. Display class summary after input collection.
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i]);
            System.out.print(Arrays.toString(subjects[i]));

            // for(int j = 0; j < subjects[i]; j++) {
            //     // Do something later
            // }
        }
    }
}