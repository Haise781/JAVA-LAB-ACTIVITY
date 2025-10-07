import java.util.Scanner;

public class Valid_Tringle {
    public static void main(String[] args) {
        
        // user input
        Scanner scanner = new Scanner(System.in);

        //  reading user input
        System.out.println("Enter the Firts side of the Triangle: ");
        int side1 = scanner.nextInt();

        System.out.println("Enter the Firts side of the Triangle: ");
        int side2 = scanner.nextInt();

        System.out.println("Enter the Firts side of the Triangle: ");1
        int side3 = scanner.nextInt();


        // check if the tringle is valid
        if (side1 + side2 > side3 && side1 + side2 > side3 &&  side1 + side2 > side3) {
            System.out.println("A VALID TRIANGLE");
        } else {
            System.out.println("IS NOT VALID TRIANGLE");
        }

        // scanner close
        scanner.close();
    
    }
    
}