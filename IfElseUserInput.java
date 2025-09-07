import java.util.Scanner;

public class IfElseUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a program in Java that asks the user to enter two numbers.
        // Then display the following results using arithmetic operators:
        //
        // 1. The sum of the two numbers
        // 2. The difference of the two numbers
        // 3. The product of the two numbers
        // 4. The quotient of the two numbers
        // 5. The remainder (modulus) of the two numbers

        System.out.println("Select an arithmetic operation that you want to use: ");
        System.out.println("SUM, DIFFERENCE, PRODUCT, QUOTIENT, REMAINDER");
        String operation = scanner.nextLine(); 
        System.out.println("");

        System.out.println("Enter the First number: ");
        int n1 = scanner.nextInt();
        System.out.println("");

        System.out.println("Enter the Second Number: ");
        int n2 = scanner.nextInt();

    
        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        int quotient = (n2 != 0) ? n1 / n2 : 0;   // para ma iwasan ma decide by zero 
        int remainder = (n2 != 0) ? n1 % n2 : 0;

        if (operation.equalsIgnoreCase("SUM")) {
            System.out.println("The sum is: " + sum);
        } else if (operation.equalsIgnoreCase("DIFFERENCE")) {
            System.out.println("The difference is: " + difference);
        } else if (operation.equalsIgnoreCase("PRODUCT")) {
            System.out.println("The product is: " + product);
        } else if (operation.equalsIgnoreCase("QUOTIENT")) {
            if (n2 != 0) {
                System.out.println("The quotient is: " + quotient);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }
        } else if (operation.equalsIgnoreCase("REMAINDER")) {
            if (n2 != 0) {
                System.out.println("The remainder is: " + remainder);
            } else {
                System.out.println("Error: Cannot divide by zero!");
            }
        } else {
            System.out.println("Invalid operation selected. Please try again!!!");
        }

        scanner.close();
    }
}
