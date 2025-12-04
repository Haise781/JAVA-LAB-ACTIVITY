import java.util.Scanner;

public class Task17_Ledesma_Christopher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== Student Information Analytics System =====");
            System.out.print("\nEnter number of students: ");

            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline

            String[] names = new String[n];
            double[] prelimGrade = new double[n];
            double[] midtermGrade = new double[n];
            double[] finalGrade = new double[n];
            double[] TotalAverage = new double[n];
            char[] letterGrade = new char[n];

            // Input data
            for (int i = 0; i < n; i++) {

                System.out.println("\nStudent " + (i + 1));
                System.out.print("Enter your name: ");
                names[i] = scanner.nextLine();

                // Prelim
                do {
                    System.out.print("Enter Prelim Grade (0-100): ");
                    prelimGrade[i] = scanner.nextDouble();
                    if (prelimGrade[i] < 0 || prelimGrade[i] > 100) {
                        System.out.println("Invalid grade! Try again.");
                    }
                } while (prelimGrade[i] < 0 || prelimGrade[i] > 100);

                // Midterm
                do {
                    System.out.print("Enter Midterm Grade (0-100): ");
                    midtermGrade[i] = scanner.nextDouble();
                    if (midtermGrade[i] < 0 || midtermGrade[i] > 100) {
                        System.out.println("Invalid grade! Try again.");
                    }
                } while (midtermGrade[i] < 0 || midtermGrade[i] > 100);

                // Final
                do {
                    System.out.print("Enter Final Grade (0-100): ");
                    finalGrade[i] = scanner.nextDouble();
                    if (finalGrade[i] < 0 || finalGrade[i] > 100) {
                        System.out.println("Invalid grade! Try again.");
                    }
                } while (finalGrade[i] < 0 || finalGrade[i] > 100);

                TotalAverage[i] = (prelimGrade[i] + midtermGrade[i] + finalGrade[i]) / 3;

                // Letter Grade
                if (TotalAverage[i] >= 96) {
                    letterGrade[i] = 'A';
                } else if (TotalAverage[i] >= 90) {
                    letterGrade[i] = 'B';
                } else if (TotalAverage[i] >= 80) {
                    letterGrade[i] = 'C';
                } else if (TotalAverage[i] >= 70) {
                    letterGrade[i] = 'D';
                } else {
                    letterGrade[i] = 'F';
                }

                scanner.nextLine(); // consume leftover newline
            }

            // Summary Table
            System.out.println("\n====================================================");
            System.out.println("STUDENT SUMMARY");
            System.out.println("====================================================");

            System.out.printf("%-20s %7s %7s %7s %9s %7s\n",
                    "Name", "Prelim", "Midterm", "Final", "Average", "Grade");
            System.out.println("----------------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.printf("%-20s %7.2f %7.2f %7.2f %9.2f %7c\n",
                        names[i], prelimGrade[i], midtermGrade[i],
                        finalGrade[i], TotalAverage[i], letterGrade[i]);
            }

            // Analysis results
            System.out.println("\n====================================================");
            System.out.println("ANALYSIS RESULTS");
            System.out.println("====================================================");

            // Highest Average
            double highestAverage = TotalAverage[0];
            String highestStudent = names[0];

            for (int i = 1; i < n; i++) {
                if (TotalAverage[i] > highestAverage) {
                    highestAverage = TotalAverage[i];
                    highestStudent = names[i];
                }
            }
            System.out.printf("Highest Average: %s - %.2f\n", highestStudent, highestAverage);

            // Lowest Average
            double lowestAverage = TotalAverage[0];
            String lowestStudent = names[0];

            for (int i = 1; i < n; i++) {
                if (TotalAverage[i] < lowestAverage) {
                    lowestAverage = TotalAverage[i];
                    lowestStudent = names[i];
                }
            }
            System.out.printf("Lowest Average: %s - %.2f\n", lowestStudent, lowestAverage);

            // Class Average
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += TotalAverage[i];
            }
            double classAverage = sum / n;
            System.out.printf("Class Average: %.2f\n", classAverage);

            // Grade Distribution
            int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

            for (int i = 0; i < n; i++) {
                switch (letterGrade[i]) {
                    case 'A': countA++; break;
                    case 'B': countB++; break;
                    case 'C': countC++; break;
                    case 'D': countD++; break;
                    case 'F': countF++; break;
                }
            }

            System.out.println("\nGrade Distribution:");
            System.out.println("A: " + countA, "B: " + countB, "C: " + countC, "D: " + countD, "F: " + countF);
            
            // ask if they want to continue 
            System.out.print("\nDo you want to continue? [Y/N]: ");
            choice = scanner.next().toUpperCase().charAt(0);

        } while (choice == 'Y');

        scanner.close();
    }
}
