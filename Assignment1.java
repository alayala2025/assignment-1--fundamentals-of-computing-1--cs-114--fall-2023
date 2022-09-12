//Justin Jaques - Assignment 1
import java.util.*;



public class Assignment1 {

    public static Scanner scan = new Scanner(System.in);
    public static double tempFarenheit;
    public static double tempCelsius;  //Output will be stored in this variable
    public static String originalString; //Input for String
    public static String cutString; //Cut version of Input String
    public static String finalString;

    public static Random r = new Random();
    public static int randomLower = 31;
    public static int randomUpper = 16385;


    //Writing all those System.out.println() lines in the main method makes me physically ill
    public static void nameDisplay() {
        System.out.println("JJJJJJJJJJJJJJJJJJ\tJJJJJJJJJJJJJJJJJJ");
        System.out.println("\tJJJ\t\t\tJJJ");
        System.out.println("\tJJJ\t\t\tJJJ");
        System.out.println("\tJJJ\t\t\tJJJ");
        System.out.println("\tJJJ\t\t\tJJJ");
        System.out.println("\tJJJ\t\t\tJJJ");
        System.out.println("\tJJJ\t\t\tJJJ");
        System.out.println("JJJJJJJJJJJ\t\tJJJJJJJJJJJ");
    }


    //I got bored and wanted to make my program more aesthetically pleasing.
    public static void typeWriter(String string) {
        for(int i = 0; i < string.length(); i++){
            System.out.printf("%c", string.charAt(i));
            try {
                Thread.sleep(100); //Pause time in between characters
            } catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
   }

   //Instead of putting all this code in the main method, I decided to put it in a function
   public static void start() {
        nameDisplay();
        typeWriter("Please enter a 5 character string:\n");
        originalString = scan.next();
        cutString = originalString.substring(1, 4); //Cuts the string
        finalString = new StringBuilder(cutString).reverse().toString(); // Reverses the cut string
        typeWriter("Please enter a temperature in Farenheit:\n");
        tempFarenheit = scan.nextInt();
        tempCelsius = (tempFarenheit - 32) * .5556; //Equation for Farenheit to Celsius
        int random = r.nextInt(randomLower, randomUpper); //Init random number
        typeWriter("Random number generated...\n");
        typeWriter("Your new string is: " + tempCelsius + finalString + random);
    }


    public static void main(String[] args) {
        start();
    }
}
