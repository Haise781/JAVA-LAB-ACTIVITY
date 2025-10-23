
import java.util.Scanner;

public class All_Midterm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("All MIDTERM EXAM CODE");
            System.out.println("1. Monthly income");
            System.out.println("2. Educational year Level");
            System.out.println("3. Income tax");
            System.out.println("4. Bolt Discount");
            System.out.println("5. Automobile Model ");
            System.out.println("6. Height and Weight");
            System.out.println("7. gas Cylinder");
            System.out.println("8. Convert value of weekend and days");
            System.out.println("9. Pythagorean");
            System.out.println("10. Water usage and water charge");
            System.out.println("11. Rating and meaning");
            System.out.println("12. Spectrum color");
            System.out.println("13. Automobile insurance premuim ");
            System.out.println("14. Zodiac sign");
            System.out.println("15. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
//                Monthly income
                System.out.println("Enter the monthly income");
                uuux

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
                    guess = scanner.nextInt();
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
                int rows = scanner.nextInt();

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

            } else if (choice == 15) {
                System.out.println("Thank you very much");
            } else {
                System.out.println("Invalid input. Try again");
            }

        } while (choice != 15);

        scanner.close();
    }
}
