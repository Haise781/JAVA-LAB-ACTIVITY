
import java.util.Scanner;

public class Task09_Ledesma_christopher_SwitchActivity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the  the operator ( -, +, /, *) : ");
        char Operations = scanner.next().charAt(0);

        System.out.print("Enter the Second Number: ");
        int n2 = scanner.nextInt();

        int result;

        switch (Operations) {
            case '+':
                if (Operations == '+') {
                    result = n1 + n2;
                    System.out.print(" The Addition result is:" + result);
                }
                break;
            case '-':
                result = n1 - n2;
                System.out.print("The Subtraction is: " + result);
                break;
            case '/':
                result = n1 / n2;
                System.out.print("The division is: " + result);
                if (n2 != 0) {
                    System.out.print("Division by zero is not allowed!");
                }
                break;
            case '*':
                result = n1 * n2;
                System.out.print("The division is: " + result);
                break;
            default:
        }
        System.out.print("Enter the valid operator ( -, +, /, *)");

        scanner.close();
    }

}
