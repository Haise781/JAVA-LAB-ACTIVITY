import java.io.IO;
import java.util.Scanner;

public class pesducode2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the Firts Number");
        int n1 = scanner.nextInt();

        System.out.println("Enter the Firts Number");
        int n2 = scanner.nextInt();

        System.out.println("Enter the Firts Number");
        int n3   = scanner.nextInt();

        System.out.println("Enter the Firts Number");
        int n4   = scanner.nextInt();

        System.out.println("Enter the Firts Number");
        int n5   = scanner.nextInt();

        int sum = n1 + n2 + n3 + n4 +n5;

        int average = sum / 5;

        System.out.println("The average is " + average);



        scanner.close();
    }

}