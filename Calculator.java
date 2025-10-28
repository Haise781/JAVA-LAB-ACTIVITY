
import java.util.Scanner;



<<<<<<< HEAD:Calculator.java
public class Calculator {

    =======
public class All_Operator {

        >>>>>>> a3237c6c9fe01959c26f9d558640db1d8fe95a0e
        :All_Operator.java

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int choice;
            do {
                System.out.println("\n=== JAVA OPERATORS CALCULATOR ===");
                System.out.println("[1] Arithmetic Operators");
                System.out.println("[2] Relational Operators");
                System.out.println("[3] Logical Operators");
                System.out.println("[4] Assignment Operators");
                System.out.println("[5] Increment/Decrement Operators");
                System.out.println("[0] Exit");
                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        arithmetic(sc);
                        break;
                    case 2:
                        relational(sc);
                        break;
                    case 3:
                        logical(sc);
                        break;
                    case 4:
                        assignment(sc);
                        break;
                    case 5:
                        incrementDecrement(sc);
                        break;
                    case 0:
                        System.out.println("Exiting program... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 0);

            sc.close();
        }

        // 1. Arithmetic Operators
        static void arithmetic(Scanner sc) {
            System.out.println("\n--- Arithmetic Operators ---");
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println(a + " + " + b + " = " + (a + b));
            System.out.println(a + " - " + b + " = " + (a - b));
            System.out.println(a + " * " + b + " = " + (a * b));
            if (b != 0) {
                System.out.println(a + " / " + b + " = " + (a / b));
                System.out.println(a + " % " + b + " = " + (a % b));
            } else {
                System.out.println("Division and modulus not allowed (b = 0).");
            }
        }

        // 2. Relational Operators
        static void relational(Scanner sc) {
            System.out.println("\n--- Relational Operators ---");
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println(a + " == " + b + " : " + (a == b));
            System.out.println(a + " != " + b + " : " + (a != b));
            System.out.println(a + " > " + b + " : " + (a > b));
            System.out.println(a + " < " + b + " : " + (a < b));
            System.out.println(a + " >= " + b + " : " + (a >= b));
            System.out.println(a + " <= " + b + " : " + (a <= b));
        }

        // 3. Logical Operators
        static void logical(Scanner sc) {

            System.out.println("\n--- Logical Operators ---");
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            boolean x = (a > 0);
            boolean y = (b > 0);
             << << << < HEAD
            :Calculator.java input
            .close();

             == == ==
                    = System.out.println("x = (a > 0) → " + x);
            System.out.println("y = (b > 0) → " + y);
            System.out.println("x && y = " + (x && y));
            System.out.println("x || y = " + (x || y));
            System.out.println("!x = " + (!x));
        }

        // 4. Assignment Operators
        static void assignment(Scanner sc) {
            System.out.println("\n--- Assignment Operators ---");
            System.out.print("Enter base number (a): ");
            int a = sc.nextInt();
            System.out.print("Enter another number (b): ");
            int b = sc.nextInt();

            int c = a;
            System.out.println("c = " + c);

            c += b;
            System.out.println("c += b → " + c);

            c -= b;
            System.out.println("c -= b → " + c);

            c *= b;
            System.out.println("c *= b → " + c);

            if (b != 0) {
                c /= b;
                System.out.println("c /= b → " + c);

                c %= b;
                System.out.println("c %= b → " + c);
            } else {
                System.out.println("Division/Modulus not allowed (b = 0).");
            }
        }

        // 5. Increment and Decrement
        static void incrementDecrement(Scanner sc) {
            System.out.println("\n--- Increment/Decrement Operators ---");
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            System.out.println("Original value: " + a);
            System.out.println("Post-increment (a++) = " + (a++));
            System.out.println("After post-increment, a = " + a);
            System.out.println("Pre-increment (++a) = " + (++a));
            System.out.println("After pre-increment, a = " + a);

            System.out.println("Post-decrement (a--) = " + (a--));
            System.out.println("After post-decrement, a = " + a);
            System.out.println("Pre-decrement (--a) = " + (--a));
            System.out.println("After pre-decrement, a = " + a);
             >>> >>> > a3237c6c9fe01959c26f9d558640db1d8fe95a0e:All_Operator.java
        }
    }
