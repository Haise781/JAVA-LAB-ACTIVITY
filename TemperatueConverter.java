import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TEMPERATURE CONVERTER ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");
        int choice = sc.nextInt();

        double temp, converted;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temp = sc.nextDouble();
                converted = (temp * 9 / 5) + 32;
                System.out.println("Fahrenheit: " + converted);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = sc.nextDouble();
                converted = (temp - 32) * 5 / 9;
                System.out.println("Celsius: " + converted);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
