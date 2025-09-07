import java.util.Scanner;

public class StudentUtilityProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Menu
            System.out.println("\n=== STUDENT UTILITY PROGRAM ===");
            System.out.println("1. Grade Calculator");
            System.out.println("2. Voting Eligibility Checker");
            System.out.println("3. Even or Odd Checker");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                // Grade Calculator
                System.out.print("Enter your score (0-100): ");
                int score = sc.nextInt();

                if (score >= 90) {
                    System.out.println("Grade: A");
                } else if (score >= 80) {
                    System.out.println("Grade: B");
                } else if (score >= 70) {
                    System.out.println("Grade: C");
                } else if (score >= 60) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }

            } else if (choice == 2) {
                // Voting Eligibility
                System.out.print("Enter your age: ");
                int age = sc.nextInt();

                if (age >= 18) {
                    System.out.println("You are eligible to vote.");
                } else {
                    System.out.println("You are NOT eligible to vote.");
                }

            } else if (choice == 3) {
                // Even or Odd
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println(num + " is EVEN.");
                } else {
                    System.out.println(num + " is ODD.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting program... Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
