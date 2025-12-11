public class task15c_Ledesma_Christopher {
    public static void main (String [] args) {

        for (int item = 1; item <= 20; item++) { // It will Loop from 1 to 20
            if (item == 12) {
                System.out.println("Cart is full, processing checkout.");
                break; // Stop the shopping process
            }
            System.out.println("Added item " + item + " to the cart."); // Print the output
        }
    }
}