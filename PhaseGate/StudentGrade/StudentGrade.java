import java.util.Scanner;

public class StudentGrade {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter number of students: ");
        int numOfStudents = input.nextInt();

        System.out.printf("Enter number of subjects: ");
        int numOfScores = input.nextInt();

        String[] students = new String[numOfStudents];
        int[] studentScores = new int[numOfScores];
        int[][] grades = new int[students.length][studentScores.length+3];

        addStudentsAndScores(input, numOfScores, students, grades);

        calculateStudentScoreTotal(numOfScores, students, grades);

        calculateStudentScoreAverage(numOfScores, students, grades);

        displayStudentGrade(numOfScores, students, grades);

        displaySubjectSummary(numOfScores, students, grades);

        input.close();
    }


    public static void addStudentsAndScores(Scanner input, int scores, String[] students, int[][] grades) {
        for(int i = 0; i < students.length; i++) {
            System.out.printf("Enter name for the student no(%d): ", i + 1);
            students[i] = input.next();
            for(int j = 0; j < grades[i].length; j++) {
                if(j >= scores) {
                    break;
                } else {
                    System.out.printf("Enter score for subject no(%d): ", j + 1);
                    int score = input.nextInt();
                    grades[i][j] = score;
                }
            }
        }
    }


    public static void calculateStudentScoreTotal(int scores, String[] students, int[][] grades) {
        for(int i = 0; i < students.length; i++){
            int total = 0;
            for(int j = 0; j < grades[i].length; j++){
                if(j == scores) {
                    grades[i][j] = total;
                }
                total += grades[i][j];
            }
        }
    }


    public static void calculateStudentScoreAverage(int scores, String[] students, int[][] grades) {
        for(int i = 0; i < students.length; i++){
            int average = 0;
            for(int j = 0; j < grades[i].length; j++){
                if(j == scores) {
                    average = grades[i][j] / scores;
                }else if(j == scores + 1) {
                    grades[i][j] = average;
                }
            }
        }
    }


    public static void displayStudentGrade(int scores, String[] students, int[][] grades){
        System.out.println("===========================================");
        System.out.print("STUDENT\t");
        for(int i = 1; i <= scores; i++){
            System.out.printf("SUB%d\t", i);
        }
        System.out.print("TOT\tAVG\tPOS\n");
        System.out.println("===========================================");
        for(int i = 0; i < students.length; i++){
            System.out.printf("%s\t",students[i]);
            for(int j = 0; j < grades[i].length; j++){
                System.out.printf("%d\t", grades[i][j]);
            }
            System.out.println();
        }
        System.out.println("===========================================");
        System.out.println("===========================================\n\n");
    }


    public static void displaySubjectSummary(int scores, String[] students, int[][] grades) {
        System.out.println("SUBJECT SUMMARY\n");
        
        for(int s = 0; s < scores; s++) {
            System.out.printf("Subject %d\n", s + 1);
            int highestScore = 0;
            int lowestScore = Integer.MAX_VALUE;
            String highestScoringStudent = "";
            String lowestScoringStudent = "";
            int totalScore = 0;
            int numOfPasses = 0;
            int numOfFails = 0;
            int averageScore = 0;
            int passingMark = 50;

            for(int i = 0; i < students.length; i++) {
                int score = grades[i][s];
                totalScore += score;

                if (score > highestScore) {
                    highestScore = score;
                    highestScoringStudent = students[i];
                }

                if (score < lowestScore) {
                    lowestScore = score;
                    lowestScoringStudent = students[i];
                }

                if (score >= passingMark) {
                    numOfPasses++;
                } else {
                    numOfFails++;
                }
            }

            averageScore = totalScore / scores;

            System.out.printf("Highest scoring student is: %s scoring %d\n", highestScoringStudent, highestScore);
            System.out.printf("Lowest scoring student is: %s scoring %d\n", lowestScoringStudent, lowestScore);
            System.out.printf("Total Score is: %d\n", totalScore);
            System.out.printf("Average Score is: %d\n", averageScore);
            System.out.printf("Number of passes: %d\n", numOfPasses);
            System.out.printf("Number of Fails: %d\n\n", numOfFails);
        }
    }

    
    public static void calculatePosition(int scores, String[] students, int[][] grades){}
}
 