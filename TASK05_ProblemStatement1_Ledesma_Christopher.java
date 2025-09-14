import java.util.Scanner;

public class TASK05_ProblemStatement1_Ledesma_Christopher {
    // Problem 1: Simple Money Exchange Program
    // This program converts money from Philippine Peso (PHP) to US Dollars (USD).
    // Exchange rate: 1 USD = 57.15 PHP

    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter the amount in Peso (PHP): ");
        double pesoAmount = scanner.nextDouble();

        // It convert PHP to USD
        double usd = pesoAmount / 57.15;

        // Display result (formatted to 2 decimal places because it's currency value thats why i used %%.2f%n")
        System.out.printf("The equivalent amount in US Dollars (USD) is: %.2f%n", usd);

        
        scanner.close();
    }
}
