import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = sc.nextLine().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop! The light is RED.");
                break;
            case "yellow":
                System.out.println("Slow down! The light is YELLOW.");
                break;
            case "green":
                System.out.println("Go! The light is GREEN.");
                break;
            default:
                System.out.println("Invalid color entered!");
        }
    }
}
