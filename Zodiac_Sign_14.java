
import java.util.Scanner;
public class Zodiac_Sign_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("What year you born? :");
        int year = scanner.nextInt();

        if (year >= 2000) {
            System.out.print("Your year of the " + "Dragon");
        } else if (year >= 2001) {
            System.out.print("Your year of the " + "Snake");
        }  else if (year >= 2002) {
            System.out.print("Your year of the " + "Horse");
        }  else if (year >= 2003) {
            System.out.print("Your year of the " + "Sheep");
        }  else if (year >= 2004) {
            System.out.print("Your year of the " + "Monkey");
        }  else if (year >= 2005) {
            System.out.print("Your year of the " + "Rooster");
        }  else if (year >= 2006) {
            System.out.print("Your year of the " + "Dog");
        }  else if (year >= 2007) {
            System.out.print("Your year of the " + "Pig");
        }  else if (year >= 2008) {
            System.out.print("Your year of the " + "Rat");
        }  else if (year >= 2009) {
            System.out.print("Your year of the " + "Ox");
        }  else if (year >= 2010) {
            System.out.print("Your year of the " + "Tiger");
        }  else if (year >= 2011) {
            System.out.print("Your year of the " + "Hare");
        }  else {
            System.out.print("Enter the valid year!");
        }

            scanner.close();
        }
    }
