public class task16a Ledesma_Christopher {
    public static void main (String [] args) {

        int[] numbers = {1, 5, 2, 5, 3, 5, 4};  // Array with multiple occurrences of the number 5
        int count = 0;
        for (int number : numbers) {  
            if (number == 5) {
                count++; // Incerement if the number is 5
            }
        }
        System.out.println("The number 5 appears " + count + " times in the array."); // Print the output
    }
