import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        final double CONVERSION_FACTOR = (5.0 / 9.0);       //Used to convert Fahrenheit to Celsius and vice versa
        System.out.println("BBBBBBB      SSSSSSS ");        //Prints the block-letter initials as seen in the code
        System.out.println("BBB   BBB   SSS   SSS");
        System.out.println("BBB   BBB   SSS      ");
        System.out.println("BBBBBBB      SSSSSSS ");
        System.out.println("BBB   BBB         SSS");
        System.out.println("BBB   BBB   SSS   SSS");
        System.out.println("BBBBBBB      SSSSSSS ");
        Scanner scan = new Scanner(System.in);              //Scanner used to obtain user input
        System.out.println("Please enter a number in Fahrenheit:");
        float TempFahrenheit = scan.nextFloat();
        float TempCelsius = (float) ((TempFahrenheit - 32) * CONVERSION_FACTOR); //Converts Fahrenheit to Celsius
        System.out.println("Please enter a 5-character string:");
        String ModifiedString = "";
    }
}
