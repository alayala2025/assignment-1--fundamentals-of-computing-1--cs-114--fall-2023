// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
    public static void main(String[] args) {

        //Variables and Declarations
        String message;
        Scanner FiveChar = new Scanner(System.in);

        int temperature;
        Scanner Temp = new Scanner(System.in);

        Random generator = new Random();
        int num1;

        // Prints Block "AK"
        System.out.println();
        System.out.println("\s\s\sAAAAAA\tKKKK\t\sKKK");
        System.out.println("\s\sAAAAAAAA\tKKKK\tKKK");
        System.out.println("AAAA\tAAAA\tKKKKKKKKK");
        System.out.println("AAAAAAAAAAAA\tKKKKKKKK");
        System.out.println("AAAA\tAAAA\tKKKK\s\sKKKK");
        System.out.println("AAAA\tAAAA\tKKKK\tKKKK");

        //Code for 5 Character string input from user
        System.out.println("\nPlease enter a 5-character string:");
            message = FiveChar.nextLine();

        //Code for Temperature integer input from user
        System.out.println("\nPlease enter a number in Fahrenheit:");
            temperature = Temp.nextInt();

        //Code for RNG
        num1 = generator.nextInt();
        System.out.println(num1);
    }
}
