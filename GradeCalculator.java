import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade:");

        double grade = scanner.nextDouble();
        
        if (grade >= 98 && grade >= 100) {
            System.out.println("Your With Highest Honor");;
        } else if (grade >= 95 && grade <= 97) {
            System.out.println("Your With High Honor");
        } else if (grade >= 90 && grade <= 94) {
            System.out.println("Your With Honor");
        } else if (grade >= 75 && grade <= 89) {
            System.out.println("Your Passed");
        } else if (grade >= 75 && grade  <=60) {
            System.out.println("Your Failed");
        } else {
            System.out.println("Input the Valid Grade of Your's ");
        }

        scanner.close();
    }
    
}
