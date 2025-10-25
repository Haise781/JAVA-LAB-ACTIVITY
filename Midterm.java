
import java.util.Scanner;

public class Midterm {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== ALL MIDTERM EXAM CODE ===");
            System.out.println("1. Monthly Income");
            System.out.println("2. Educational Year Level");
            System.out.println("3. Income Tax Calculator");
            System.out.println("4. Bolt Discount");
            System.out.println("5. Automobile Model");
            System.out.println("6. Height and Weight");
            System.out.println("7. Gas Cylinder");
            System.out.println("8. Convert Value of Weekends and Days");
            System.out.println("9. Pythagorean Theorem");
            System.out.println("10. Water Usage and Water Charge");
            System.out.println("11. Rating and Meaning");
            System.out.println("12. Spectrum Color");
            System.out.println("13. Automobile Insurance Premium");
            System.out.println("14. Zodiac Sign");
            System.out.println("15. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                // 1️⃣ Monthly Income
                case 1:
                    System.out.print("\nEnter your monthly income: ");
                    double income = scanner.nextDouble();

                    if (income < 10000) {
                        System.out.println("You are in the Low Income bracket.");
                    } else if (income <= 50000) {
                        System.out.println("You are in the Middle Income bracket.");
                    } else {
                        System.out.println("You are in the High Income bracket.");
                    }
                    break;

                // 2️⃣ Educational Year Level
                case 2:
                    System.out.print("\nEnter your years of schooling: ");
                    int years = scanner.nextInt();

                    if (years == 0) {
                        System.out.println("No formal education.");
                    } else if (years <= 6) {
                        System.out.println("Elementary Level.");
                    } else if (years <= 10) {
                        System.out.println("Junior High School Level.");
                    } else if (years <= 12) {
                        System.out.println("Senior High School Level.");
                    } else if (years <= 16) {
                        System.out.println("College Level.");
                    } else {
                        System.out.println("Post-Graduate Level.");
                    }
                    break;

                // 3️⃣ Income Tax
                case 3:
                    System.out.print("\nEnter your annual income: ");
                    double annualIncome = scanner.nextDouble();
                    double tax;

                    if (annualIncome <= 250000) {
                        tax = 0;
                    } else if (annualIncome <= 400000) {
                        tax = (annualIncome - 250000) * 0.20;
                    } else if (annualIncome <= 800000) {
                        tax = 30000 + (annualIncome - 400000) * 0.25;
                    } else {
                        tax = 130000 + (annualIncome - 800000) * 0.30;
                    }

                    System.out.println("Your estimated income tax is ₱" + tax);
                    break;

                // 4️⃣ Bolt Discount
                case 4:
                    System.out.print("\nEnter quantity of bolts purchased: ");
                    int bolts = scanner.nextInt();
                    double pricePerBolt = 5.0;
                    double total = bolts * pricePerBolt;
                    double discount = 0;

                    if (bolts >= 100) discount = 0.10;
                    else if (bolts >= 50) discount = 0.05;

                    double discountedTotal = total - (total * discount);
                    System.out.println("Total price after discount: ₱" + discountedTotal);
                    break;

                // 5️⃣ Automobile Model
                case 5:
                    System.out.print("\nEnter automobile model year: ");
                    int year = scanner.nextInt();

                    if (year < 2000) {
                        System.out.println("Old model car.");
                    } else if (year <= 2015) {
                        System.out.println("Standard model car.");
                    } else {
                        System.out.println("Latest model car.");
                    }
                    break;

                // 6️⃣ Height and Weight
                case 6:
                    System.out.print("\nEnter your height in meters: ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter your weight in kilograms: ");
                    double weight = scanner.nextDouble();

                    double bmi = weight / (height * height);
                    System.out.printf("Your BMI is %.2f - ", bmi);
                    if (bmi < 18.5) System.out.println("Underweight");
                    else if (bmi < 25) System.out.println("Normal weight");
                    else if (bmi < 30) System.out.println("Overweight");
                    else System.out.println("Obese");
                    break;

                // 7️⃣ Gas Cylinder
                case 7:
                    System.out.print("\nEnter the size of the gas cylinder (in kg): ");
                    double size = scanner.nextDouble();

                    double price;
                    if (size == 11) price = 900;
                    else if (size == 7) price = 600;
                    else if (size == 2.7) price = 300;
                    else price = 0;

                    if (price > 0)
                        System.out.println("The price of a " + size + "kg cylinder is ₱" + price);
                    else
                        System.out.println("Invalid cylinder size.");
                    break;

                // 8️⃣ Convert Weekend and Days
                case 8:
                    System.out.print("\nEnter number of days: ");
                    int days = scanner.nextInt();
                    int weeks = days / 7;
                    int remainingDays = days % 7;
                    System.out.println(days + " days = " + weeks + " week(s) and " + remainingDays + " day(s).");
                    break;

                // 9️⃣ Pythagorean Theorem
                case 9:
                    System.out.print("\nEnter side A: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter side B: ");
                    double b = scanner.nextDouble();
                    double c = Math.sqrt((a * a) + (b * b));
                    System.out.printf("The hypotenuse is %.2f\n", c);
                    break;

                // 🔟 Water Usage and Charge
                case 10:
                    System.out.print("\nEnter water usage in cubic meters: ");
                    double usage = scanner.nextDouble();
                    double charge;

                    if (usage <= 10) charge = usage * 15;
                    else if (usage <= 20) charge = usage * 20;
                    else charge = usage * 25;

                    System.out.println("Total water bill: ₱" + charge);
                    break;

                // 1️⃣1️⃣ Rating and Meaning
                case 11:
                    System.out.print("\nEnter rating (1–5): ");
                    int rate = scanner.nextInt();
                    switch (rate) {
                        case 1 -> System.out.println("Very Poor");
                        case 2 -> System.out.println("Poor");
                        case 3 -> System.out.println("Average");
                        case 4 -> System.out.println("Good");
                        case 5 -> System.out.println("Excellent");
                        default -> System.out.println("Invalid rating.");
                    }
                    break;

                // 1️⃣2️⃣ Spectrum Color
                case 12:
                    System.out.print("\nEnter wavelength in nm (380–750): ");
                    int wavelength = scanner.nextInt();

                    if (wavelength < 450) System.out.println("Color: Violet");
                    else if (wavelength < 495) System.out.println("Color: Blue");
                    else if (wavelength < 570) System.out.println("Color: Green");
                    else if (wavelength < 590) System.out.println("Color: Yellow");
                    else if (wavelength < 620) System.out.println("Color: Orange");
                    else if (wavelength <= 750) System.out.println("Color: Red");
                    else System.out.println("Not visible spectrum.");
                    break;

                // 1️⃣3️⃣ Automobile Insurance Premium
                case 13:
                    System.out.print("\nEnter car value: ");
                    double value = scanner.nextDouble();
                    double premium = value * 0.05;
                    System.out.println("Your estimated insurance premium is ₱" + premium);
                    break;

                // 1️⃣4️⃣ Zodiac Sign
                case 14:
                    System.out.print("\nEnter your birth month (1–12): ");
                    int month = scanner.nextInt();
                    System.out.print("Enter your birth day: ");
                    int day = scanner.nextInt();

                    String zodiac = "";
                    if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) zodiac = "Aquarius";
                    else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) zodiac = "Pisces";
                    else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) zodiac = "Aries";
                    else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) zodiac = "Taurus";
                    else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) zodiac = "Gemini";
                    else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) zodiac = "Cancer";
                    else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) zodiac = "Leo";
                    else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) zodiac = "Virgo";
                    else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) zodiac = "Libra";
                    else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) zodiac = "Scorpio";
                    else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) zodiac = "Sagittarius";
                    else zodiac = "Capricorn";

                    System.out.println("Your zodiac sign is: " + zodiac);
                    break;

                // 1️⃣5️⃣ Exit
                case 15:
                    System.out.println("\nThank you for using the program!");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }

        } while (choice != 15);
        
        scanner.close();
    }
}