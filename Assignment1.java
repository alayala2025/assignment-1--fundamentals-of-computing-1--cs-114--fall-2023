
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("MMM            MMM           SSSSSS\n" +
                           "MMM MMM    MMM MMM         SSS     SSS\n" +
                           "MMM   MM   MM  MMM         SSS\n" +
                           "MMM     MMM    MMM          SSSS\n" +
                           "MMM      M     MMM             SSS\n" +
                           "MMM            MMM       SSS      SSS\n" +
                           "MMM            MMM        SSSS     SSS\n" +
                           "MMM            MMM           SSSSSS\n");

        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a 5-character string");
        String fiveLetterWord = scanner.nextLine();
        String fiveLetterWord2 = fiveLetterWord.substring( 1, 4);

        System.out.println("Please enter a number in Fahrenheit:");
        int temp;
        temp = scanner.nextInt();
        int celcius;
        celcius = (temp - 32) / 5/9;
        System.out.println("Your temperature in Celcius is: " + celcius);

        System.out.println("Random number generated. Continuing...");

        Random generator = new Random ();
        int num;
        int low = 32;
        int high = 16384;
        num = generator.nextInt(high-low);
        System.out.println("Your random number is: " + num);

        System.out.println("Your new string is" );
}
    }
