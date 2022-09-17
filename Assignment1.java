// Import libraries here
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        float fahrenheit;
        int RanNum;

        //prints out initials
        System.out.println("      JJ\tPPPPPPPPPPP");
        System.out.println("      JJ\tPP      PPPP");
        System.out.println("      JJ\tPP      PPPPP");
        System.out.println("      JJ\tPP      PPPP");
        System.out.println("      JJ\tPPPPPPPP");
        System.out.println("      JJ\tPP");
        System.out.println("      JJ\tPP");
        System.out.println("JJ    JJ\tPP");
        System.out.println(" J    J \tPP");
        System.out.println("  JJJJ  \tPP");
        
        //scans temp from user and converts to celcius
        Scanner scanT = new Scanner(System.in);
        System.out.print("Enter a temprature in Fahrenheit: ");
        fahrenheit = scanT.nextFloat();
       
        //scans string from user, removes 1st & last characters, and flips
        Scanner scanw = new Scanner(System.in);
        System.out.print("Type a 5 letter sting: ");
        String str= scanw.nextLine();
        String strNew1 = str.substring(0, str.length()-1);
        String strNew2 = strNew1.substring(1, str.length()-1);
        String reverse = new StringBuffer(strNew2).reverse().toString();

        //genorates random number
        Random genorator = new Random();
        RanNum = genorator.nextInt(16352) + 32;
        
        //prints crafted string
        System.out.println("Random String: " + ((fahrenheit-32)*5/9) 
                            + reverse + RanNum);

    }
}
