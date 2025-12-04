import java.util.Scanner;
public class Task 17_ledesma_Chrtopher {

      public class static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        char choice;
    do {
        System.out.println("\nStudent Information Analytics System ");
        System.out.print ("\n Enter number of students:");

        int n = scanner.nextInt();
        scanner.nextLine(); // It will consume the new line

        String [] names = new String [n];
        double [] prelimGrade = new double [n];
        double [] midtermGrade = ne double [n];
        double [] finalGrade = new double [n];
        double [] TotalAverage = new double [n];
        char [] letterGrade = new char [n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n Student " + (i + 1));
            System.out.println("Enter your name: ");

            names [i] = scanner.nextLine();

                 // It will input the prelim grade and validate it
             do {
                System.out.print(" Enter the Prelim Grade (0 - 100): ");
                prelimGrade [i] = scnner.nextDouble();
                if (prelimGrade [i] < 0 || prelimGrade [i] > 100) {
                    System.out.println ("Invalid grade. PLease enter the grade between 0 and 100.");
                } while (prelimGrade [i] <0 || prelimGrade [i] > 100);
             }
        }
              // It will input the midterm grade and validate it
         do {
            System.out.println("Enter the  Midterm Grade (0 - 100): ");
            midtermGrade [i] = scanner.nextDouble();
               if (midtermGrade [i] < 0 || midtermGrade [i] > 100) {
                     System.out.println ("Invalid grade. PLease enter the grade between 0 and 100.");
               }  while (midtermGrade [i] <0 || midtermGrade [i] > 100);
         }
    } 
            // It will input the Final grade and validate it
        do {
            System.out.println("Enter the Final Grade (0 - 100): ");
            finalGrade [i] = scanner.nextDouble();
                if (finalGrade [i] < 0 || finalGrade [i] > 100) {
                    System.out.println ("Invalid grade. PLease enter the grade between 0 and 100.");
                } while (finalGrade [i] <0 || finalGrade [i] > 100);
        
                // It will compute the average grade
                TotalAverage [i] = (prelimGrade [i] + midtermGrade [i] + finalGrade [i]) /3;
        }

        // Assign the letter grade based on the average

         if (TotalAverage [i] >= 96 && TotalAverage [i] <= 100) {
            letterGrade [i] = 'A';
         } else if (TotalAverage [i] >= 90 && TotalAverage [i] <= 95) {
            letterGrade [i] = 'B';
         } else if (TotalAverage [i] >= 80 && TotalAverage [i] <= 89) {
             letterGrade [i] = 'C';
         } else if (TotalAverage [i] >= 70 && TotalAverage [i] <= 79) {
             letterGrade [i] = 'D';
         } else {
            letterGrade [i] = 'F';
         }

        //  Display the summary table
        System.out.println( "\n =====================================================================");
        System.out.println("STUDENT SUMMARY");
        System.out.println( "\n =====================================================================");

        System.out.printf( "Name, Prelim, Midterm, Final, Average,Letter Grade\n");
        System.out.println ("---------------------------------------------------------------------")
 
        for (int i = 0; i < n; i ++) {
            System.out.printf(" % -20s %7.2f %7.2f %7.2f %7.2f %7c\n",)
            names [i], prelimGrade [i], midtermGrade [i], finalGrade [i], TotalAverage [i], letterGrade [i];


        //  Display Analysis Results
        System.out.println( "\n =====================================================================");
        System.out.println("ANALYSIS RESULTS");
        System.out.println( "\n =====================================================================");

        // Highest Average Result
        double highestAverage = TotalAverage [0];
        String highestStudent = names [0];

        for (int i = 1; i < n; i++) {
            if(TotalAverage [i] > highestAverage) {
                highestAverage = TotalAverage [i];
                highestStudent = names [i];
            }
        System.out.printf(" Highest Average: %s - %.2f\n", highestStudent, highestAverage);
        }

        // lowest Average Result
        double lowestAverage = TotalAverage [0];
        String lowestStudent = names [0];
        for (int i = 1; i < n; i++) {
            if(TotalAverage [i] < lowestAverage) {
                lowestAverage = TotalAverage [i];
                lowestStudent = names [i];
            }
        System.out.printf(" Lowest Average: %s - %.2f\n", lowestStudent, lowestAverage);
        }

        // Class Average Result
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += TotalAverage [i];
        }

        double classAverage = sum / n;
        System.out.printf(" Class Average: %.2f\n", classAverage);

        // Grade Distributions Result 
        int countA, countB, countC, countD, countF = 0;

        for (int i = 0; i < n; i++) {
            switch (letterGrade [i] ) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                case 'D':
                    countD++;
                    break;
                case 'F':
                    countF++;
                    break;
            }
        }
        // Displate the Grade Distributions
        System.out.println("\n Grade Distribution:");
        System.out.printf(" A: %d student(s)\n", countA);
        System.out.printf(" B: %d student(s)\n", countB);
        System.out.printf(" C: %d student(s)\n", countC);
        System.out.printf(" D: %d student(s)\n", countD);
        System.out.printf(" F: %d student(s)\n", countF);
    }
        System.out.print("\n Do you want to continue using the system[Y/N]? : ");
        choice = scanner.next().toUppperCase().chart{0};
        
        { while (choce = Y);}
        
    scanner.close();

    }
}