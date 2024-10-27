import java.util.Scanner;

public class RunMBTIMain {
    public static void  main(String... args) {
        Scanner input = new Scanner(System.in);

        String guide = """
            For this MBTI personality test you are to select between A to E
            A -> Strongly Agree
            B -> Agree
            C -> Partially Agree
            D -> Disagree
            E -> Strongly Disagree
        """;

        String[] questions = {
                "You regularly make new friends.",
                "Complex and novel ideas excite you more than simple and straightforward ones. ",
                "You usually feel more persuaded by what resonates emotionally with you than by factual arguments. ",
                "Your living and working spaces are clean and organized. ",
                "You usually stay calm, even under a lot of pressure. ",
                "You find the idea of networking or promoting yourself to strangers very daunting. ",
                "You prioritize and plan tasks effectively, often completing them well before the deadline.",
                "People’s stories and emotions speak louder to you than numbers or data. ",
                "You like to use organizing tools like schedules and lists. ",
                "Even a small mistake can cause you to doubt your overall abilities and knowledge. ",
                "You feel comfortable just walking up to someone you find interesting and striking up a conversation. ",
                "You are not too interested in discussions about various interpretations of creative works. ",
                "You prioritize facts over people’s feelings when determining a course of action. ",
                "You often allow the day to unfold without any schedule at all. ",
                "You rarely worry about whether you make a good impression on people you meet. ",
                "You enjoy participating in team-based activities. ",
                "You enjoy experimenting with new and untested approaches. ",
                "You prioritize being sensitive over being completely honest. ",
                "You actively seek out new experiences and knowledge areas to explore. ",
                "You are prone to worrying that things will take a turn for the worse. ",
        };

        String[] answers = new String[questions.length];

        MBTI mbti = new MBTI("Gerard");

        mbti.askQuestion(guide, questions, answers);

        mbti.displayResult(questions, answers);
    }
}