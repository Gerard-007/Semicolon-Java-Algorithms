import java.util.Scanner;

public class MBTI {
    Scanner input = new Scanner(System.in);

    private String userName;

    public MBTI(String initialUser) {
        this.userName = initialUser;
    }

    public String getUserAnswer(Scanner input) {
        String answer;

        while (true) {
            System.out.print("Please enter your answer (A, B, C, D, E): ");
            answer = input.nextLine().toUpperCase();

            if (answer.equals("A")) {
                return "Strongly Agree";
            } else if (answer.equals("B")) {
                return "Agree";
            } else if (answer.equals("C")) {
                return "Partially Agree";
            } else if (answer.equals("D")) {
                return "Disagree";
            } else if (answer.equals("E")) {
                return "Strongly Disagree";
            } else {
                System.out.println("Invalid answer. Please enter a valid option: A, B, C, D, or E.");
            }
        }
    }

    public  void askQuestion(String guide, String[] questions, String[] answers) {
        int counter = 0;
        System.out.println(guide);
        while (counter < questions.length) {
            System.out.println(questions[counter]);
            answers[counter] = this.getUserAnswer(input);
            counter ++;
        }
    }

    public void displayResult(String[] questions, String[] answers) {
        System.out.printf("Hello %s, Thanks for answering all MBTI personality questions below are your answers.\n", this.userName);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.printf("You answered: %s", answers[i]);
        }
    }
}