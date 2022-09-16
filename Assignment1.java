// Import libraries here
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        float fahrenheit;

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
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a temprature in Fahrenheit: ");
        fahrenheit = scan.nextInt();

        System.out.println("Temp in Celcius" + ((fahrenheit-32)*5/9));
    }
}
