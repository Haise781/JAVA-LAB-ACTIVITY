import java.util.Scanner;

public class TASK05_ProblemStatement3_Ledesma_Christopher {
    //3. Arithmetic Operations. Create a program that ask the user for 2 input numbers.
    //Then print the added result, subtracted, multiplied and divided (follow the rules of each operations).
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner (System.in);

        // Ask a use for 2 input numbers
        System.out.println("Enter the firts Number: ");
        System.out.println("Enter the seconfd Number: ");

        // Store The input numbers
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        // It perform arithmetic operations
        int subtraction = n1 - n2;
        int multiplication = n1 * n2;
        int addition = n1 + n2;
        int division = n1 / n2;

        // Display the results
        System.out.println("The addition is " + addition);
        System.out.println("The multiplication is " + multiplication);
        System.out.println("The subtraction is " + subtraction);
        System.out.println("The division is " + division);

        // Close the scanner
        scanner.close();
    
    }
}