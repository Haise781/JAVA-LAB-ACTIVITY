public class task15a_Ledesma_Christopher {
    public static void main (String [] args) {

        // It will print numbers from 1 to 15, but it wil skip by 3
        for (int i = 1; i <= 15; i++) { // Loop from 1 to 15
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i); // It will print the output
        }


    }
}