
import java.util.Scanner;

public class Ledesma_ChristopherJho_Sambo_MidtermExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = true;

        while (again) {
            int year = inputYear(scanner);
            int weight = inputWeight(scanner);
            int weightClass = determineWeightClass(year, weight);
            double fee = computeFee(year, weight);

            displayResult(year, weight, weightClass, fee);

            System.out.print("Do you want to process another vehicle? (yes/no): ");
            String response = scanner.next();
            again = response.equalsIgnoreCase("yes");
            System.out.println();
        }

        scanner.close();
    }

    public static int inputYear(Scanner scanner) {
        int year = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter Model Year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year > 1900 && year <= 2100) {
                    valid = true;
                } else {
                    System.out.println("Invalid year. Enter a valid year between 1900 and 2100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return year;
    }

    public static int inputWeight(Scanner scanner) {
        int weight = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter Vehicle Weight (in lbs): ");
            if (scanner.hasNextInt()) {
                weight = scanner.nextInt();
                if (weight > 0 && weight <= 10000) {
                    valid = true;
                } else {
                    System.out.println("Invalid weight. Enter a value between 1 and 10,000 lbs.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return weight;
    }

    public static int determineWeightClass(int year, int weight) {
        int weightClass = 0;

        if (year <= 1990) {
            if (weight < 2700) {
                weightClass = 1;
            } else if (weight <= 3800) {
                weightClass = 2;
            } else {
                weightClass = 3;
            }
        } else if (year >= 1991 && year <= 1999) {
            if (weight < 2700) {
                weightClass = 4;
            } else if (weight <= 3800) {
                weightClass = 5;
            } else {
                weightClass = 6;
            }
        } else if (year >= 2000) {
            if (weight < 3500) {
                weightClass = 7;
            } else if (weight <= 3800) {
                weightClass = 8;
            } else {
                weightClass = 9;
            }
        }
        return weightClass;
    }

    public static double computeFee(int year, int weight) {
        double fee = 0.0;

        if (year <= 1990) {
            if (weight < 2700) {
                fee = 26.50;
            } else if (weight <= 3800) {
                fee = 35.50;
            } else {
                fee = 56.50;
            }
        } else if (year >= 1991 && year <= 1999) {
            if (weight < 2700) {
                fee = 35.50;
            } else if (weight <= 3800) {
                fee = 45.50;
            } else {
                fee = 62.50;
            }
        } else if (year >= 2000) {
            if (weight < 3500) {
                fee = 49.50;
            } else if (weight <= 3800) {
                fee = 56.50;
            } else {
                fee = 70.50;
            }
        }
        return fee;
    }

    public static void displayResult(int year, int weight, int weightClass, double fee) {
        System.out.println();
        System.out.println("Model Year: " + year);
        System.out.println("Vehicle Weight: " + weight + " lbs");
        System.out.println("Weight Class: " + weightClass);
        System.out.printf("Registration Fee: $%.2f%n", fee);
        System.out.println();
    }
}
