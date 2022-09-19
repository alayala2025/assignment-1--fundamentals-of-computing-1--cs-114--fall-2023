// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
	public static void main(String[] args) {
		//Variables and Declarations
		String input;
		Scanner FiveChar = new Scanner(System.in);

		int celsius;
		int fahrenheit;
		Scanner Temp = new Scanner(System.in);

		Random generator = new Random();
		int randNum;

		// Prints Block "AK"
		System.out.println();
		System.out.println("\s\s\sAAAAAA\tKKKK\t\sKKK");
		System.out.println("\s\sAAAAAAAA\tKKKK\tKKK");
		System.out.println("AAAA\tAAAA\tKKKKKKKKK");
		System.out.println("AAAAAAAAAAAA\tKKKKKKKK");
		System.out.println("AAAA\tAAAA\tKKKK\s\sKKKK");
		System.out.println("AAAA\tAAAA\tKKKK\tKKKK");

		//5 Character string input from user
		System.out.println("\nPlease enter a 5-character string:");
			input = FiveChar.nextLine();

		//Temperature integer input from user
		System.out.println("\nPlease enter a number in Fahrenheit:");
			fahrenheit = Temp.nextInt();

		//Change F to Celsius
		celsius = (fahrenheit - 32) * 5/9;

		//Modifys the 5 character input (remove first and last letter, than mirror inner three)
		input = input.substring(1,4);
			//NEED TO FIND OUT HOW TO FLIP THE STRING IDK HOW

		//RNG
		randNum = generator.nextInt(16384 - 32) + 32;

		//Creating the Final String
		System.out.println("\nYour new string is " + celsius + input + randNum);



	}
}
