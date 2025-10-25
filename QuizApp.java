import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String answer;

        System.out.println("=== JAVA QUIZ ===");

        System.out.print("Q1: Who developed Java? (a) Microsoft (b) Sun Microsystems (c) Google → ");
        answer = sc.next().toLowerCase();
        if (answer.equals("b")) score++;

        System.out.print("Q2: Which symbol ends a statement in Java? (a) : (b) ; (c) . → ");
        answer = sc.next().toLowerCase();
        if (answer.equals("b")) score++;

        System.out.print("Q3: Java is a ___ language. (a) low-level (b) high-level (c) machine → ");
        answer = sc.next().toLowerCase();
        if (answer.equals("b")) score++;

        System.out.println("You scored: " + score + "/3");

        if (score == 3)
            System.out.println("Excellent!");
        else if (score == 2)
            System.out.println("Good job!");
        else
            System.out.println("Keep practicing!");
    }
}
