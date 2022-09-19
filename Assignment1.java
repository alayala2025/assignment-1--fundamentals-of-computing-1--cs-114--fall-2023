// Import libraries here
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
       System.out.println("CCCCCCCCCCCC\tCCCCCCCCCCCC");
       System.out.println("CCCCCCCCCCCC\tCCCCCCCCCCCC");
       System.out.println("CCCCC\t\tCCCCC");
       System.out.println("CCCCC\t\tCCCCC");
       System.out.println("CCCCC\t\tCCCCC");
       System.out.println("CCCCCCCCCCCC\tCCCCCCCCCCCC");
       System.out.println("CCCCCCCCCCCC\tCCCCCCCCCCCC");

       System.out.println("\n");
       Scanner character = new Scanner(System.in);

       System.out.println("Please enter a 5-character string:");
       String userInput = character.nextLine();
       userInput = userInput.substring(1, userInput.length()-1);
       StringBuilder reverseString = new StringBuilder(userInput);
       reverseString.reverse();
        String result = reverseString.toString();

        System.out.println("Please enter a number in Fahrenheit");
        int celcius = character.nextInt();

        int min = 32;
        int max = 16384;
        int randomNum = (int)(Math.random()*(max-min+1)+min);

        System.out.println("Your new string is: " + ((celcius-32)*5/9) + result + randomNum);
    }
}
