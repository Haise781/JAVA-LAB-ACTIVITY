import java.util.Scanner;

public class pseducode3 {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your name :" );
    String student = scanner.nextLine();

    System.out.println("Enter your grade : ");
    Double grade = scanner.nextDouble();

    if (grade > 90) {
        System.out.println("You got A Grade");
    } 
    else if (grade < 80) {
        System.out.println("You got B Grade");
    }

    else if (grade < 70) {
        System.out.println("You got C Grade");
    }
        else if (grade < 70) {
        System.out.println("You got a F Grade");
    }

    else {
        System.out.println("");
    }

}
