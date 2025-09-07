import java.util.Scanner;

public class psedocode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (Number 1): ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number (Number 2): ");
        double n2 = sc.nextDouble();

        System.out.print("Enter third number (Number 3): ");
        double n3 = sc.nextDouble();

        double greatest = n1;


        if (n2 > n1) {
            greatest = n2;
        }

        if (n3 > greatest) {
            greatest = n3;
        }

        System.out.println("The greatest number is : " + greatest);
        sc.close();
    }
}
-