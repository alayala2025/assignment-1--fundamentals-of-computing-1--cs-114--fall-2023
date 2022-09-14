import java.util.*; // Used to import the Scanner and Random classes

public class Assignment1 {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = (5.0 / 9.0);       // Used to convert Fahrenheit to Celsius and vice versa
        Scanner input = new Scanner(System.in);             // Scanner used to obtain user input
        float tempFahrenheit, tempCelsius;
        String inputString, trimString;
        StringBuilder modifiedString;                       // Used to build the reversed string
        Random generator = new Random();                    // Used to generate a random number
        int randomNumber;
        String outputFinal;
        
        System.out.println("BBBBBBB      SSSSSSS ");      // Prints the block-letter initials as seen in the code
        System.out.println("BBB   BBB   SSS   SSS");
        System.out.println("BBB   BBB   SSS      ");
        System.out.println("BBBBBBB      SSSSSSS ");
        System.out.println("BBB   BBB         SSS");
        System.out.println("BBB   BBB   SSS   SSS");
        System.out.println("BBBBBBB      SSSSSSS ");
        
        System.out.println("\nPlease enter a number in Fahrenheit:");
        tempFahrenheit = input.nextFloat();
        
        tempCelsius = (float) ((tempFahrenheit - 32) * CONVERSION_FACTOR); // Converts Fahrenheit to Celsius
        
        System.out.println("Please enter a 5-character string:");
        inputString = input.next();
        
        trimString = inputString.substring(1,4);
        modifiedString = new StringBuilder(trimString).reverse();      // Reverses string and removes end characters

        randomNumber = generator.nextInt(16353) + 32;
        System.out.println("Random number generated. Proceeding...");

        outputFinal = "" + tempCelsius + modifiedString + randomNumber;
        System.out.println("Your new string is: \"" + outputFinal + "\"");
    }
}
