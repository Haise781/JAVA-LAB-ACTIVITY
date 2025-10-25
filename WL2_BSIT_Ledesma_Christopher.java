
import java.util.Scanner;

public class WL2_BSIT_Ledesma_Christopher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int counter = 1;

        while (counter <= number) {
            sum += counter;
            counter++;
        }

        System.out.println("The sum of numbers from 1 to " + number + " is: " + sum);

        scanner.close();
    }
}
