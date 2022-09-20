import java.util.Random;
import java.util.Scanner;

// Import libraries here

public class Assignment1 {
    public static void main(String[] args) {
        // Part 1: Initials
        System.out.println (" \tEEEEEEEEEEE\tGGGGGGGGGGG") ;
        System.out.println (" \tEEE\t\tGGG") ;
        System.out.println (" \tEEE\t\tGGG") ;
        System.out.println (" \tEEE\t\tGGG") ;
        System.out.println (" \tEEEEEEEEE\tGGG\tGGG") ;
        System.out.println (" \tEEE\t\tGGG\tGGG") ;
        System.out.println (" \tEEE\t\tGGG\tGGG") ;
        System.out.println (" \tEEE\t\tGGG\tGGG") ;
        System.out.println (" \tEEEEEEEEEEE\tGGGGGGGGGGG") ;
        System.out.println ();

        //Part 2: Tempurature converter
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter a temperature in fahrenheit: ");
        double fahrenheit = scan.nextDouble ();
        double celsius = (5.0 / 9)  *  (fahrenheit - 32);

        //Part 3: Five character string formatter
        Scanner scan2 = new Scanner(System.in);
        System.out.print ("Enter 5 characters: ");
        String original = scan2.nextLine();
        StringBuffer reverse = new StringBuffer(original).reverse();
        String Trimmed = reverse.substring( 1, reverse.length() - 1);

        //Part 4: Random number
        Random rand = new Random ();
        int RandomNumber = rand.nextInt((16384 - 32));

        //Part 5: Printing to screen
        System.out.println ("Your string: " + celsius + Trimmed + RandomNumber);


    }
}
