import java.util.Scanner;

public class TriviaQuiz {
        private static final String[][] QUESTIONS = {
                {"What is the capital of France?", "Paris"},
                {"Who wrote 'To Kill a Mockingbird'?", "Harper Lee"},
                {"What is the chemical symbol for water?", "H2O"},
                {"What is the tallest mammal?", "Giraffe"},
                {"Who painted the Mona Lisa?", "Leonardo da Vinci"}
        };

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Trivia Quiz!");
            System.out.println("Answer the following questions:");

            int score = 0;
            for (String[] question : QUESTIONS) {
                System.out.println(question[0]);
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine().trim();

                if (userAnswer.equalsIgnoreCase(question[1])) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is: " + question[1]);
                }
            }

            System.out.println("\nQuiz ended!");
            System.out.println("Your final score: " + score + " out of " + QUESTIONS.length);

            scanner.close();
    }
}
