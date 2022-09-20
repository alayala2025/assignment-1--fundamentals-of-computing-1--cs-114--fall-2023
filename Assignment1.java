import java.util.Scanner;
import java.util.Random;
// Import libraries here

public class Assignment1 {
    public static void main(String[] args) {
        // Add your code here
        System.out.println("KKK\tKKK\t\tNNN\t\tNNN");
        System.out.println("KKK " + "KKK\t\t\tNNNNNNN\t\tNNN");
        System.out.println("KKKKK\t\t\tNNNNNNNNN\tNNN");
        System.out.println("KKK " + "KKK\t\t\tNNNN\tNNNNNNN\tNNN");
        System.out.println("KKK\tKKK\t\tNNN\t\tNNN");
        //My first initial K for Kamau
        //My second initial N for Nicholas
        //Step 1 of assignment 1 completed
        System.out.println();
        System.out.println();
        //This is for Step 2 of Assignment 1
        //I need to ask the user to input a value for fahrenheit 
        
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Enter a 5 letter word: ");
        String word = scanner.nextLine();

        String reverse = "";
        for(int i = word.length() - 1; i>= 0; i--){
            reverse += word.charAt(i);
            System.out.println(reverse);
        }
        System.out.println("Enter a temperature in fahrenheit: ");
        double temperature = scanner.nextDouble();

        temperature = (temperature - 32) * 5/9;
        System.out.println("Your temperature in Celsius is " + temperature);

        int x = random.nextInt(16369)+15;
        System.out.println("Your random number is: " + x);

        System.out.println("Your username is: " + x + reverse + temperature);








        
    


       



    }
}
