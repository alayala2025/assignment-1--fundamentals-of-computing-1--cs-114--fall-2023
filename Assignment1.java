// Import libraries here
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        float fahrenheit;
        short Num;
        int RanNum;
        int Word;

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

        Random genorator = new Random();
        RanNum = genorator.nextInt(16352) + 32;
        System.out.println("Random Number: " + RanNum);

        Scanner scanw = new Scanner(System.in);
        System.out.print("Type a 5 letter sting: ");
        String str= scanw.nextLine();
        String strNew1 = str.substring(0, str.length()-1);
        String strNew2 = strNew1.substring(1, str.length()-1);
        String reverse = new StringBuffer(strNew2).reverse().toString();
        System.out.println("You have entered: "+ reverse); 
    }
}
