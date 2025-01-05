import java.util.Scanner;

public class QuestionService {
    Question questions[] = new Question[5];

    String answers[] = new String[5];
    String selections[] = new String[5];

    QuestionService() {
        questions[0] = new Question(1, "Size of int", "2", "4", "3", "6", "4");
        questions[1] = new Question(2, "Capital of France", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[2] = new Question(3, "Square root of 16", "2", "4", "8", "16", "4");
        questions[3] = new Question(4, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus",
                "Mars");
        questions[4] = new Question(5, "Who developed Java?", "Microsoft", "Oracle", "Sun Microsystems", "Google",
                "Sun Microsystems");
        ;
    }

    public void playQuiz() {

        int i = 0;
        int count = 0;
        for (Question q : questions) {
            System.out.print("Question no. : " + q.getId() + " ");
            System.out.println(q.getQuestion());
            System.out.println("Option 1 : " + q.getOpt1());
            System.out.println("Option 2 : " + q.getOpt2());
            System.out.println("Option 3 : " + q.getOpt3());
            System.out.println("Option 4 : " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Answer : ");
            selections[i] = sc.nextLine();
            answers[i] = q.getAnswer();
            i++;
        }
        System.out.println("*****************Your Result*******************");
        for (int j = 0; j < 5; j++) {
            if (answers[j].equals(selections[j])) {
                count++;
            }
        }
        System.out.println("Your Score is " + count + "/5");
    }
}
