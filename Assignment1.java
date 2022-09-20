// Import libraries here
import java.util.Scanner;


public class Assignment1 {
    public static void main(String[] args) {
        double fahrenheit = 0;
        double celsius = 0;
        String enteredstring = "";
        int randomnumber = 0;
        String withoutFirstAndLast = "";
        String finalstring = "";
        Scanner scan = new Scanner(System.in);

        System.out.println ();
        //Print Initials "MK", made out of the letters
        System.out.println ("\tMMMM             MMMM    KKKK     KKKK");
        System.out.println ("\tMMMM MMMM   MMMM MMMM    KKKK   KKKK");
        System.out.println ("\tMMMM     MMM     MMMM    KKKK KKKK");
        System.out.println ("\tMMMM     MMM     MMMM    KKKK KKKK");
        System.out.println ("\tMMMM             MMMM    KKKK   KKKK");
        System.out.println ("\tMMMM             MMMM    KKKK    KKKK");
        System.out.println ("\tMMMM             MMMM    KKKK     KKKK");
        System.out.println ();

        //Ask for the temperature (F)
        System.out.println ("Please enter a number in Fahrenheit:");
        fahrenheit = scan.nextDouble ();
        //Convert (F) to (C)
        celsius = (fahrenheit-32)*(0.5556);

        //Ask for the 5 character string
        System.out.println ("Please enter a 5-character string:");
        enteredstring = scan.next();
        //Remove first and last characters
        withoutFirstAndLast = enteredstring.substring(1,enteredstring.length()-1);

        //number between 32 and 16,384
        randomnumber = (int)(Math.random()*16362+32);

        //print final string
        finalstring = (celsius + withoutFirstAndLast + randomnumber);
        System.out.println (finalstring);
    }
}
