
import java.util.Random;
import java.util.Scanner;



public class Assignment1 {
    public static void main(String[] args) {
    System.out.println("MMM        MMM" + "\t  GGGGGGGGG");
    System.out.println("MMMM      MMMM" + "\t GGGGGGGGGGG");
    System.out.println("MMMMM    MMMMM" + "\tGGGG");
    System.out.println("MMMMMMMMMMMMMM" + "\tGGG    GGGGGG");
    System.out.println("MMM MMMMMM MMM" + "\tGGGG      GGG");
    System.out.println("MMM  MMMM  MMM" + "\t GGGGGGGGGGG");
    System.out.println("MMM        MMM" + "\t  GGGGGGGGG");


    Scanner scan = new Scanner(System.in);

    int Fahrenheit;
    double Celcius;

    System.out.println("Enter a number in Fahrenheit: ");
    Fahrenheit = scan.nextInt();

    Celcius = (Fahrenheit-32) / 1.8;

    String message1, message2, NewMessage;
    System.out.println("Enter a 5 character string: ");
    message1 = scan.next();
    message2 = message1.substring(1,4);
    NewMessage = message2;

    Random Generator = new Random();
    int Rnumber;
    Rnumber = Generator.nextInt(16384) +32;

    System.out.println("Adding randomized number.....");

    System.out.println("Final String:"+Celcius +NewMessage +Rnumber);

    }
}
