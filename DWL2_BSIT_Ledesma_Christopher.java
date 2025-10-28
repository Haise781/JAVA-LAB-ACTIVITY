
import java.util.Scanner;
public class DWL2_BSIT_Ledesma_Christopher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char answer;

            // Repeat until the user enters 'Y' or 'N'
        do {
            System.out.print("Enter 'Y' or 'N': ");
            
            // It convert user input to uppercase so both lowercase and uppercase letters are accepted
            answer = scanner.next().toUpperCase().charAt(0);

            if (answer != 'Y' && answer != 'N') {
                System.out.println("Invalid input. Please enter only 'Y' or 'N'.");
            }

        } while (answer != 'Y' && answer != 'N');

        System.out.println(" You entered: " + answer);
        scanner.close();
    }
}