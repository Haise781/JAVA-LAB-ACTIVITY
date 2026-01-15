public task15b_Ledesma_Christopher {
    public static void main (String [] args) {

        String prog = "programming"; // String of programming

        for (int i = 0; i < prog.Length(); i++) { // Loop through each chracter
            
            char ch = prog.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') { // check chracter is it is not vowel

                System.out.print(ch); // print the consonant OR output 
                continue;
            }
        }
    }
}