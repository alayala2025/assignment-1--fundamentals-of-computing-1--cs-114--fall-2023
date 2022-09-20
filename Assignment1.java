// Import libraries here

public class Assignment1 {
    public static void main(String[] args) {
        // Add your code here
    }
}
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


      import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        task1();
        float celsius=task2();
        StringBuilder string=task3();
        int number=task4();
        System.out.println("your new string is " +celsius+string+number);
    }

    public static void task1(){

        // Printing R
        printCharacter('R', 8);
        System.out.println();// used as a new line
        printCharacter('R', 3);
        printCharacter(' ', 4);
        printCharacter('R', 3);
        System.out.println();// used as a new line
        printCharacter('R', 3);
        printCharacter(' ', 4);
        printCharacter('R', 3);
        System.out.println();// used as a new line
        printCharacter('R', 2);
        printCharacter(' ', 1);
        printCharacter('R', 3);
        System.out.println();// used as a new line
        printCharacter('R', 3);
        printCharacter(' ', 2);
        printCharacter('R', 3);
        System.out.println();// used as a new line
        printCharacter('R', 3);
        printCharacter(' ', 4);
        printCharacter('R', 3);
        System.out.println();// used as a new line
        printCharacter('R', 3);
        printCharacter(' ', 6);
        printCharacter('R', 3);

        System.out.println();// used as a new line
        System.out.println();// used as a new line

        //printing D
        printCharacter('D', 4);
        System.out.println();// used as a new line
        printCharacter('D', 3);
        printCharacter(' ', 3);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        printCharacter('D', 3);
        printCharacter(' ', 5);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        printCharacter('D', 3);
        printCharacter(' ', 7);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        printCharacter('D', 3);
        printCharacter(' ', 8);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        printCharacter('D', 3);
        printCharacter(' ', 7);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        printCharacter('D', 3);
        printCharacter(' ', 5);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        printCharacter('D', 4);
        printCharacter(' ', 3);
        printCharacter('D', 3);
        System.out.println();// used as a new line
        
    }
    public static void printCharacter(char c, int numberOfTimesToBePrinted){
        for(int i=0; i<numberOfTimesToBePrinted; i++){
          System.out.print(c);  
        }
    }

    public static float task2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in farenheight: ");
        float fahrenheit, celsius;  
        fahrenheit = input.nextFloat();  
        celsius  = ((fahrenheit-32)*5)/9;//coverting fareheit into celsius
        return celsius;
    }
    
    public static StringBuilder task3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 char string");
        String string = scan.next();
        if(string.length()!=5)    //checking if length of string is 5
        {
            while(string.length()!=5)
            {
                System.out.println("wrong input");
                System.out.println("Enter 5 char string");
                string = scan.next();
            }
            
        }
        StringBuilder str= new StringBuilder(string);
        str.reverse();//reversing the string
        str.deleteCharAt(str.length() - 1); //deleting last letter
        str.deleteCharAt(0);   //deleting first letter
        return str;
    
    }

    public static int task4() {
        Random random =new Random();
        int Min=16;
        int Max=16384;
        int number=Min + (int)(Math.random() * ((Max - Min) + 1));//generating a random number
        
        System.out.println("number is generated");
        return number;
    }
}

