import java.util.Scanner;
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
        //I need to ask the user to input a value for fahrenheit and
        //then translate it into celsuis; so x times 32
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a temperature in Fahrenheit: ");
        double temperature = scanner.nextInt();

        System.out.println("The temperature is "+temperature+" in Celsius");



    }
}
