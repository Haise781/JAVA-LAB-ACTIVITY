import java.util.Scanner;

public class Task07_Ledesma_Christopher_LogicalOperatorsActivity {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // User Input 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have an ID? (true/false): ");
        boolean hasID = scanner.nextBoolean();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Conditions using logical operators
        boolean entryAllowed = (age >= 18) && hasID;                    // This is Entry Rule
        boolean eligibleForDiscount = isStudent || (age < 18);          // This is Discount Rule
        boolean minorAtRisk = (age < 18) && !hasID;                     // This is Minor without ID
        boolean seniorPrivileged = (age >= 60) && (isStudent || hasID); // This is Senior with Privilege

        // The Output
        System.out.println("\n--- Event Entry Report ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Has ID: " + hasID);
        System.out.println("Is Student: " + isStudent);

        System.out.println("\nResults:");
        System.out.println("Can enter the event: " + entryAllowed);
        System.out.println("With Discount: " + eligibleForDiscount);
        System.out.println("Minor without ID: " + minorAtRisk);
        System.out.println("Senior with privilege: " + seniorPrivileged);

        // Close Scanner
        scanner.close();
    }
}

/*
 GUIDE QUESTIONS & ANSWERS

1.In an expression using &&, when is the result true? When is it false?
    If one of them is false, the whole expression becomes false.

2.In an expression using ||, when is the result true? When is it false?
    It will only be false if both conditions are false.

3.What effect does the ! operator have on a condition? 
    If the condition is true, it becomes false, and if its false, it becomes true.

4. How is using the Scanner class better than hardcoding values?
    type their own input while the program is running. This makes the program flexible, 
    unlike hardcoding which is fixed and not interactive.

*/
