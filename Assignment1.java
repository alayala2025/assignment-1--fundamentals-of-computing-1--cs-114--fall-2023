
import java.util.Scanner;

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
        System.out.println("Please enter a number in Fahrenheit:");

    Scanner scan = new Scanner(System.in);

    int temp;
    temp = scan.nextInt();

    int celcius;
    celcius = (temp - 32) / 5/9;

}
    }
