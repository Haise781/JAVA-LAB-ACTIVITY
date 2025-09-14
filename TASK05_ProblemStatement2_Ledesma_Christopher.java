import java.util.Scanner;

public class TASK05_ProblemStatement2_Ledesma_Christopher {
   // 2. Kilometers to miles. Create a program that ask user for distance in kilometers. Then, output distance in miles.
   //Note that, 1 km is equivalent to 0.6214 miles.
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner (System.in);
  
        // Ask the use for distance in kilometers
        System.out.println("Enter the distance in Kilometers: ");

        // Store the input kilometers   
        double kilometers = scanner.nextDouble();
 
        //It convert kilometers to miles
        double miles = kilometers * 0.6213712;
        
        // Diplat the result
        System.out.println("The distance of " + miles + " miles " )  ;


        // Close the Scanner
        scanner.close();
    }
}
