import java.util.Scanner;
public class Task13_LedesmaChristoher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("\nEnter your password: ");
            String password = scanner.nextLine();

            int upperCase = 0;
            int lowerCase = 0;
            int digitsCount = 0;


            
            int specialCount = 0;

            // Count character types
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch))
                    upperCase++;
                else if (Character.isLowerCase(ch))
                    lowerCase++;
                else if (Character.isDigit(ch))
                    digitsCount++;
                else
                    specialCount++;
            }

            // check the password
            boolean hasuppercase =  upperCase > 0;
            boolean haslowercase = lowerCase > 0;
            boolean hasdigits = digitsCount > 0;
            boolean hasspecials = specialCount > 0;

            int length = password.length();

            String strength;

            int typeCount = 0;
            if (hasuppercase) typeCount++;
            if (haslowercase) typeCount++;
            if (hasdigits) typeCount++;
            if (hasspecials) typeCount++;

            if (length >= 10 && hasuppercase && haslowercase && hasdigits && hasspecials)
                strength = "Strong";
            else if (length >= 6 && length <= 9 || typeCount >= 2)
                strength = "Moderate";
            else
                strength = "Weak";

            // Display the results
            System.out.println("--- password Analysis --- " );
            System.out.println("");
            System.out.println("Uppercase:" + upperCase);
            System.out.println("Lowercase:" + lowerCase);
            System.out.println("Digits:" + digitsCount);
            System.out.println("Special:" + specialCount);
            System.out.print("strength: " + strength);

            // Ask the user if they want to try again
            System.out.println("\nDo you want to check another password [Y/N]: ");
            choice = scanner.nextLine().toUpperCase().charAt(0);
        } while (choice == 'Y');
        System.out.println("\nThank you for using the Password Strength Checker Program.");
        scanner.close();
    }
}




