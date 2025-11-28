import java.util.Scanner;

public class Task12_01_LEDESMA_Christopher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter starting number: ");
            int start = scanner.nextInt();

            System.out.print("Enter ending number: ");
            int end = scanner.nextInt();

            int evenCount = 0;
            int oddCount = 0;

            System.out.println();
            System.out.println("Even numbers between " + start + " and " + end + ":");
            int num = start;
            while (num <= end) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                    evenCount++;
                }
                num++;


                
                
            }

            System.out.println("\n");
            System.out.println("Odd numbers between " + start + " and " + end + ":");
            num = start;
            while (num <= end) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                    oddCount++;
                }
                num++;

                
            }

            System.out.println("\n");
            System.out.println("Total even numbers: " + evenCount);
            System.out.println("Total odd numbers: " + oddCount);
            System.out.println();

            System.out.print("Do you want to try again? (Y/N): ");
            choice = scanner.next().charAt(0);

            if (choice == 'Y' || choice == 'y') {
                System.out.println();
            }

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the program!");
        scanner.close();


    }
}
