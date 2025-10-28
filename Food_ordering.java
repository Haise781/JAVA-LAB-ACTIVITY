
import java.util.Scanner;

public class Food_ordering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String itemName = "";
        double total = 0;

        //  Display menu
        System.out.println("Welcome to Victual Vending Café!");
        System.out.println("Please choose from our menu below:\n");
        System.out.println("1. Burger - ₱80");
        System.out.println("2. Pizza - ₱120");
        System.out.println("3. Milk Tea - ₱70");
        System.out.println("4. Fries - ₱50");
        System.out.println("5. Ice Cream - ₱45\n");

        // Ask for user input
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Determine order based on choice
        switch (choice) {
            case 1:
                itemName = "Burger";
                total = 80 * quantity;
                break;

            case 2:
                itemName = "Pizza";
                total = 120 * quantity;
                break;

            case 3:
                itemName = "Milk Tea";
                total = 70 * quantity;
                break;

            case 4:
                itemName = "Fries";
                total = 50 * quantity;
                break;

            case 5:
                itemName = "Ice Cream";
                total = 45 * quantity;
                break;

            default:
                System.out.println("️ Invalid choice! Please restart and choose from 1–5.");
                scanner.close();
                return; // end program if invalid
        }

        //  Display results
        System.out.println("\nYou chose: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Your total is: ₱" + total);
        System.out.println("Thank you for ordering! 🍽️");

        scanner.close();
    }
}
