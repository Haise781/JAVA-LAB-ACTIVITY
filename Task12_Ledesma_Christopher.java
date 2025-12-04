import java.util.Scanner;

public class Task12_Ledesma_Christopher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] dailySales = new double[7];
        double totalSales = 0;
        double highestSales = Double.NEGATIVE_INFINITY;
        double lowestSales = Double.POSITIVE_INFINITY;
        int highestDay = -1;
        int lowestDay = -1;

        IO.println("------ WEEKLY SALES TRACKING SYSTEM ------");

        for (int day = 0; day < 7; day++) {
            double sales;

            // This is the Input Validation Loop
            do {
                System.out.print("Enter the sales for Day " + (day + 1) + ": ");
                sales = scanner.nextDouble();

                if (sales < 0) {
                    System.out.println("Invalid input. Sales cannot be negative.");
                }
            } while (sales < 0);

            dailySales[day] = sales;
            totalSales += sales;

            // Check The highest
            if (sales > highestSales) {
                highestSales = sales;
                highestDay = day;
            }

            // Check The lowest
            if (sales < lowestSales) {
                lowestSales = sales;
                lowestDay = day;
            }
        }

        double averageSales = totalSales / 7;

        // Display the console Daily List
        IO.println("\n------ DAILY SALES LIST ------");
        for (int day = 0; day < 7; day++) {
            System.out.printf("Day %d Sales: ₱%.2f%n", day + 1, dailySales[day]);
        }

        // Display in the console Summary
        IO.println("\n------ WEEKLY SALES SUMMARY ------");
        System.out.printf("Total Sales: ₱%.2f%n", totalSales);
        System.out.printf("Average Daily Sales: ₱%.2f%n", averageSales);
        System.out.printf("Highest Sales: ₱%.2f (Day %d)%n", highestSales, highestDay + 1);
        System.out.printf("Lowest Sales: ₱%.2f (Day %d)%n", lowestSales, lowestDay + 1);

        scanner.close();
    }
}
