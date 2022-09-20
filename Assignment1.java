import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment1 {
    public static void main(String[] args) {
        // Block Letter Intials
        System.out.println("KK   KK   SSSS  ");
        System.out.println("KK  KK  SSS  SSS");
        System.out.println("KK KK   SS");
        System.out.println("KKKK      SSSS  ");
        System.out.println("KK KK         SS");
        System.out.println("KK  KK  SSS  SSS");
        System.out.println("KK   KK   SSSS  ");

        Scanner sc = new Scanner(System.in);

        String reverse = "";
        char fiveChar;

        // Random 5 Letter String
        System.out.print("Enter a 5 letter string: ");
        String str = sc.nextLine();

        // Temperature
        System.out.print("Enter a temperature in Fahrenheit: ");
        double temp = sc.nextInt();

        // Isolating Character to Reverse
        for (int i = 0; i < str.length(); i++) {
            fiveChar = str.charAt(i);
            reverse = fiveChar + reverse;
        }

        // Taking out First and Last Character
        reverse = reverse.substring(1, 4);

        // Generate Random Number
        int randNum = ThreadLocalRandom.current().nextInt(32, 16385);

        // Convert 
        double convert = (temp - 32) * 5 / 9;

        // Print
        System.out.println(convert + reverse + randNum);
    }
}
