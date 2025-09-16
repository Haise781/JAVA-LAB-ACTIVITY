import java.nio.file.OpenOption;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the Oprration (+, -, *, /.)");
        char Operations = scanner.next().charAt(0);

        System.out.println("Entee Second Number:");
        int secondNumber = scanner.nextInt();

        int result;

        switch (Operations) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("The addition is " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("The subtraction is " + result);
                break;
            case '*':
                result = firstNumber * secondNumber:
                System.out.println("The multiplication is " + result);
                break;
            case '/':
            if (secondNumber !=0) {  
                result = firstNumber / secondNumber;
                System.out.println("The division is " + result);
            } else {
                System.out.println("Error: Dvision by zero is not allowed.");
            }
                break;
                default:
                System.out.println("Invalid operation. Please enter on of (+, -, *, /.) make sure to use the correct symbols.");
                break;
            }
        scanner.close();
    }
}