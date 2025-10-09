
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Arithmetic Operators
        System.out.println("\n=== Arithmetic Operations ===");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        // Relational Operators
        System.out.println("\n=== Relational Operations ===");
        System.out.println(num1 + " == " + num2 + " → " + (num1 == num2));
        System.out.println(num1 + " != " + num2 + " → " + (num1 != num2));
        System.out.println(num1 + " > " + num2 + " → " + (num1 > num2));
        System.out.println(num1 + " < " + num2 + " → " + (num1 < num2));

        // Logical Operators
        System.out.println("\n=== Logical Operations ===");
        boolean condition1 = (num1 > 0);
        boolean condition2 = (num2 > 0);
        System.out.println("num1 > 0 && num2 > 0 → " + (condition1 && condition2));
        System.out.println("num1 > 0 || num2 > 0 → " + (condition1 || condition2));
        System.out.println("!(num1 > 0) → " + (!condition1));

        // Assignment Operators
        System.out.println("\n=== Assignment Operations ===");
        int x = num1;
        x += num2; // x = x + num2
        System.out.println("x after += " + num2 + " → " + x);
        x *= 2;    // x = x * 2
        System.out.println("x after *= 2 → " + x);

        // Increment & Decrement
        System.out.println("\n=== Increment & Decrement ===");
        int y = num2;
        System.out.println("y++ (post-increment): " + (y++)); // shows old value then add 1
        System.out.println("After y++ → " + y);
        System.out.println("++y (pre-increment): " + (++y)); // add 1 then show
        System.out.println("y-- (post-decrement): " + (y--));
        System.out.println("After y-- → " + y);

        input.close();

    }
}
