import java.util.Scanner;

public class StudentGrade {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        int numOfScores = input.nextInt();
        String[] students = new String[numOfStudents];
        int[] studentGrades = new int[numOfScores];
        int[] grades = new int[studentGrades.length];

        input.close();
    }

    public static void addStudentsAndScores(int numOfStudents, int numOfScores) {
    }

    public static void calculateStudentScoreTotal(int numOfStudents, int numOfScore) {
    }
}
