
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
