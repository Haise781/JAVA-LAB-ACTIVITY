
import java.util.Scanner;

public class ProjectLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // The menu repeats using a do-while loop
        do {
            System.out.println("\n===== LOOP PROJECT MENU =====");
            System.out.println("1. Print Number Sequence (for loop)");
            System.out.println("2. Guessing Game (while loop)");
            System.out.println("3. Star Pattern Generator (nested loops)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                // =============================
                // OPTION 1: Number Sequence
                // =============================
                System.out.print("\nEnter a number to count up to: ");
                int n = sc.nextInt();

                System.out.println("Printing numbers 1 to " + n + ":");
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        continue; // skip even numbers
                    }
                    System.out.print(i + " ");
                    if (i == 15) {
                        System.out.println("\nReached 15! Stopping early...");
                        break; // stop loop if reaches 15
                    }
                }
                System.out.println();

            } else if (choice == 2) {
                // =============================
                // OPTION 2: Guessing Game
                // =============================
                int secret = 7;
                int guess;
                int attempts = 0;

                System.out.println("\n--- Guess the Number Game ---");
                System.out.println("Hint: Number is between 1 and 10.");

                while (true) { // infinite loop until correct guess
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    attempts++;

                    if (guess == secret) {
                        System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                        break; // exit loop
                    } else if (guess < secret) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                }

            } else if (choice == 3) {
                // =============================
                // OPTION 3: Star Pattern
                // =============================
                System.out.print("\nEnter number of rows for pattern: ");
                int rows = sc.nextInt();

                System.out.println("\nTriangle Pattern:");
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                System.out.println("\nReverse Triangle Pattern:");
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } else if (choice == 4) {
                System.out.println("\n👋 Exiting program... Thank you!");
            } else {
                System.out.println("\nInvalid choice. Please try again!");
            }

        } while (choice != 4); // run until user exits

        sc.close();
    }
}
