import java.util.Scanner;

public class Task09_Ledesma_christopher_SwitchActivity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // It is read the input from the user input

        // ask the user to enter the numbers and the operator
        System.out.print("Enter the First Number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the  the operator ( -, +, /, *) : ");
        char Operations = scanner.next().charAt(0);

        System.out.print("Enter the Second Number: ");
        int n2 = scanner.nextInt();

        // oprations using the switch statement
        int result;

        // perform the opration based on the operator
        switch (Operations) {
            case '+':
                result = n1 + n2;
                System.out.print("The Addition result is:" + result);
                break;

            case '-':
                result = n1 - n2;
                System.out.print("The Subtraction is: " + result);
                break;
            case '/':
                if (n2 !=0) {
                    result = n1 / n2;
                    System.out.println("The division is " + result);
                } else {
                    System.out.println("The operation is invalid. Check the value of the operand.");
                }
                break;
            case '*':
                result = n1 * n2;
                System.out.print("The division is: " + result);
                break;
            default:
            
                System.out.print("The operation is invalid. Check the operator!");
                break;
                
        }

        // close the scanner
        scanner.close();
    }

}
