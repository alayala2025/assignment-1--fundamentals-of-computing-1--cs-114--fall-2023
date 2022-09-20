
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

    System.out.println("Enter a number in Fahrenheit: ");

    System.out.println("Enter a 5 character string: ");

    Random Generator = new Random();
    int num1;
    num1 = Generator.nextInt(16384) +32;

    System.out.println("Adding randomized number.....");

    System.out.println("Final String:"+num1);

    }
}
