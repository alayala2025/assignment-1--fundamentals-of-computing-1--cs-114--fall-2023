// Import libraries here
import java.util.*;

public class Assignment1 {
    
    public static void main(String[] args) {
        float fahrenheit;
        float celsius;
		int store;
       System.out.println("       AAAA            CCCCCC");
       System.out.println("      A    A         CCC  ");
       System.out.println("     A      A       CCC  ");
       System.out.println("    AAAAAAAAAA     CCC  ");
       System.out.println("   A          A     CCC  ");
       System.out.println("  A            A      CCC  ");
       System.out.println(" A              A       ccCCC  ");
       
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Fahrenheit Temperature: ");
       fahrenheit = input.nextFloat();
       celsius = ((fahrenheit-32) * 5/9);

       Scanner john = new Scanner(System.in);
	   System.out.print("Enter string: ");
	   String aiden = john.nextLine();
	   String james = aiden.substring(0, aiden.length()-1);
	   String juan = james.substring(1, aiden.length()-1);
	   String song = new StringBuffer(juan).reverse().toString();

	   Random Gen = new Random();
	   store = Gen.nextInt(16352) +32;

	   System.out.println("New String " +celsius +song +store);

	}
}