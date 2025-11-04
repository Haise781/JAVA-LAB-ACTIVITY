
import java.util.Scanner;

public class DWL1_BSIT_Ledesma_Christopher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int number;

        do { 
            System.out.print("Enter an even number between 1 and 10: ");
            number = scanner.nextInt();
            
            if (number < 1 || number > 10 || number % 2 != 0) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (number < 1 || number > 10 || number % 2 != 0);


        
        System.out.println("Valid even number entered: " + number);\







        scanner.close();

    }
}