import java.util.Scanner;
public class Task12_02_LEDESMA_Christopher {
    
    public static void main(String[] args) {
   //            It will perform While loop statement
                System.out.println("Multiplication Table using WHILE LOOP:\n");
                int i = 1;
                while (i <= 10) {
                    int j = 1;
                    while (j <= 10) {
                        System.out.print((i * j) + " ");
                        j++;
                    }
                    System.out.println();
                    i++;
                }
                
//                It will perform the Do while loop statement
                System.out.println("\nMultiplication Table using DO-WHILE LOOP:\n");
                int x = 1;
                do {
                    int y = 1;
                    do {
                        System.out.print((x * y) + " ");
                        y++;
                    } while (y <= 10);
                    System.out.println();
                    x++;
                } while (x <= 10);
            }
        }































    }
    
}
