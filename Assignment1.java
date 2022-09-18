import java.util.Scanner;  // Import the Scanner class
import java.util.Random; //Import the random number generator

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println ("\n  CCCCCC       DDDDDD  ");              //Prints initials
        System.out.println (" CCC           DD    DD ");
        System.out.println ("CCC            DD    DD ");
        System.out.println ("CCC            DD    DD ");
        System.out.println ("CCC            DD    DD ");
        System.out.println (" CCC           DD    DD ");
        System.out.println ("  CCCCCC       DDDDDD\n ");



        String Five;                                                     //Variable for 5 character input string
        System.out.println ("Please enter a 5-character string:");
        Scanner scan = new Scanner(System.in);
        Five = scan.nextLine();                                              //Stores input

        String FiveAfter = Five.substring(1,4);          //FiveAfter clones the 5-character string
        String FiveTrim = "";                                                 //FiveTrim is empty to store FiveAfter

        for (int i = 2; i >=0; i--)                                     //reverses characters from FiveAfter and sends into FiveTrim
                    {FiveTrim += FiveAfter.charAt(i);}



        double Fahrenheit;
        double Celsius;
        final double CONVERSION_FACTOR = 9.0 / 5.0;                          //Fahrenheit to Celcius formula
        System.out.println ("Please enter a temperature in Farenheit:");

        Fahrenheit = scan.nextInt();

        Celsius = ((Fahrenheit-32)*5)/9;                                     //Calculation after input



        Random generator = new Random();                                //Calls random number generator
        int RandomNum;

        RandomNum = generator.nextInt(16384) + 32;                     //Generators a number inside and including the parameters
        System.out.println ("Random number generated. Continuing...");

        System.out.println ("Your new string is:" + Celsius + FiveTrim + RandomNum); //Final string
    }
}


