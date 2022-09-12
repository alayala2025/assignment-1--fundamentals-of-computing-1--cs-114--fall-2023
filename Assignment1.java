import java.util.*; // Used to import the Scanner and Random classes

public class Assignment1 {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = (5.0 / 9.0);       // Used to convert Fahrenheit to Celsius and vice versa
        Scanner scan = new Scanner(System.in);              // Scanner used to obtain user input
        float tempFahrenheit, tempCelsius;
        String inputString, shortString;
        StringBuilder modifiedString; // Used to build the reversed string
        Random generator;
        
        System.out.println("BBBBBBB      SSSSSSS ");      // Prints the block-letter initials as seen in the code
        System.out.println("BBB   BBB   SSS   SSS");
        System.out.println("BBB   BBB   SSS      ");
        System.out.println("BBBBBBB      SSSSSSS ");
        System.out.println("BBB   BBB         SSS");
        System.out.println("BBB   BBB   SSS   SSS");
        System.out.println("BBBBBBB      SSSSSSS ");
        System.out.println("Please enter a number in Fahrenheit:");
        
        tempFahrenheit = scan.nextFloat();
        tempCelsius = (float) ((tempFahrenheit - 32) * CONVERSION_FACTOR); // Converts Fahrenheit to Celsius
        
        System.out.println("Please enter a 5-character string:");
        inputString = scan.next();
        shortString = inputString.substring(1,4);
        modifiedString = new StringBuilder(shortString).reverse();


    }
}
