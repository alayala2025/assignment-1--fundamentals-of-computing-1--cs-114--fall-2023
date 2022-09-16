// Import libraries here
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        float fahrenheit;
        short Num;
        short RanNum;

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
        
        Scanner scanT = new Scanner(System.in);
        System.out.print("Enter a temprature in Fahrenheit: ");
        fahrenheit = scanT.nextFloat();
        System.out.println("Temp in Celcius: " + ((fahrenheit-32)*5/9));

        Scanner scanRN = new Scanner(System.in);
        System.out.print("Enter a number between 31 - 16,385");
        Num = scanRN.nextFloat();
        Random genorator = new Random();
        RanNum = genorator.nextFloat(16352) + 32;
        System.out.println("Random Number: " + RanNum);

    }
}
