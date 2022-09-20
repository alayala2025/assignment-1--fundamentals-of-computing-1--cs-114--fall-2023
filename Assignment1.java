import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment1 {
    public static void main(String[] args) {
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

        System.out.print("Enter a 5 letter string: ");
        String str = sc.nextLine();

        System.out.print("Enter a temperature in Fahrenheit: ");
        double temp = sc.nextInt();

        for (int i = 0; i < str.length(); i++) {
            fiveChar = str.charAt(i);
            reverse = fiveChar + reverse;
        }

        reverse = reverse.substring(1, 4);
        int randNum = ThreadLocalRandom.current().nextInt(32, 16385);
        double convert = (temp - 32) * 5 / 9;

        System.out.println(convert + reverse + randNum);
    }
}
