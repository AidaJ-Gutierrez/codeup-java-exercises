
import java.util.Scanner;
public class MethodsExercises {




//1.Basic Arithmetic
//a. Create four separate methods. Each will perform an arithmetic operation:
//Addition
//Subtraction
//Multiplication
//Division
// b. Each function needs to take two parameters/arguments so that the operation can be performed.
//Test your methods and verify the output.
//Add a modulus method that finds the modulus of two numbers.

    public static double addition(double num1, double num2){
            return num1 + num2;
    }
    public static double subtraction(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }
    public static double division(double num1, double num2){
        return num1 / num2;
    }
    public static double modulus(double num1, double num2){
        return num1 % num2;
    }


    //Food for thought: What happens if we try to divide by zero? What should happen?
// Answer: "Infinity."
//Bonus
////Create your multiplication method without the * operator (Hint: a loop might be helpful).
//Do the above with recursion.

//---------------------------------------------------------------------------------------------------------------------
//2.Create a method that validates that user input is in a certain range
////The method signature should look like this:
////public static int getInteger(int min, int max);
//
// and is used like this:
////System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);


//If the input is invalid, prompt the user again.
////Hint: recursion might be helpful here!


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        boolean addInt = true;
        do{


        //user prompt
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();
        scanner.nextLine();

        //if statement to check int is in range
        if (userInput >= min && userInput <= max) {
            return userInput;
        }else{
            System.out.println("That number is not in range!!! Please try again.");
            return getInteger(min, max);
        }
        }while (addInt);
    }


//3. Calculate the factorial of a number.
//
//Prompt the user to enter an integer from 1 to 10.
//Display the factorial of the number entered by the user.
//Ask if the user wants to continue.
//Use a for loop to calculate the factorial.
//Assume that the user will enter an integer, but verify it’s between 1 and 10.
//Use the long type to store the factorial.
//Continue only if the user agrees to.
//A factorial is a number multiplied by each of the numbers before it.
//Factorials are denoted by the exclamation point (n!). Ex:
//
//
//1! = 1               = 1
//2! = 1 x 2           = 2
//3! = 1 x 2 x 3       = 6
//4! = 1 x 2 x 3 x 4   = 24
//Bonus
//
//Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//Use recursion to implement the factorial.
public static long factorial(int number) {
      long factorial = 1;
      do{

      }while();
    for (int f = number; f > 0; f--) {
        factorial *= f;
    }
    return factorial;
}
//--------------------------------------------------------------------------------------------------------------

    //4.Create an application that simulates dice rolling.
    public static void continueRolling() {
        Scanner scanner = new Scanner(System.in);
        boolean moreRolls = true;
        while (moreRolls) {
            diceRolling();
            System.out.println("Do you want to play again?(y/n");
            String userResponse = scanner.nextLine();
            if (userResponse.equalsIgnoreCase("n")) {
                System.out.println("Ok, Bye!");
                moreRolls = false;
            } else if (userResponse.equalsIgnoreCase("y")) {
                System.out.println("Great!");

            } else {
                System.out.println("Mmmm... I don't know what are you trying to do. Maybe play later, Bye. ");
                moreRolls = false;
            }

        }
    }

    public static void diceRolling() {
        Scanner scanner = new Scanner(System.in);
//Ask the user to enter the number of sides for a pair of dice.
        System.out.println("Pick the number of sides for you pair of dice");
        int diceSides = getInteger(1, 10);

        //Prompt the user to roll the dice.
        // and then ask the user if he/she wants to roll the dice again.
        boolean rollDice = true;
        while (rollDice) {
            System.out.println("To roll the dice press ENTER key");
            String answer = scanner.nextLine();
            if (answer.equals("")) {
                // here call the roll dice method
                System.out.println("Your got a total of : " + rollingDice(diceSides));
            }else{
                System.out.println("I guess you don't want to play!");
                rollDice = false;
            }

        }
    }

    // and then ask the user if he/she wants to roll the dice again.


         //Use static methods to implement the method(s) that generate the random numbers.
        //Use the .random method of the java.lang.Math class to generate random numbers.
        //"Roll" two n-sided dice, display the results of each,
    public static int rollingDice(int max){
            int rollOne = (int)(Math.random() * max * 1);
            System.out.println("You got: " + rollOne + " on your first Dice!");
            int rollTwo = (int)(Math.random() * max * 1);
            System.out.println("You got: " + rollTwo + " on your second Dice!");
            return ( rollOne + rollTwo);
        }

//---------------------------------------------------------------------------------------------------------------
//5.Game Development 101
//
//Welcome to the world of game development!
////You are going to build a high-low guessing game. Create a class named HighLow inside of src.
////The specs for the game are:
////Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
////Use the random method of the java.lang.Math class to generate a random number.
//Bonus
////Keep track of how many guesses a user makes.
//Set an upper limit on the number of guesses.



//--------------------------------------------------------------------------------------------------------------

    //main method and calling each of the methods you've created.

public static void main(String [] args){
        // 1.arithmetic

    System.out.println("PART 1");
    System.out.println(addition(6,6));
    System.out.println(subtraction(6,6));
    System.out.println(multiplication(6,6));
    System.out.println(division(6,3));
    System.out.println(modulus(6,6));

    //Input range
    System.out.println("PART 2");
    System.out.println(getInteger(1,10));

    //factorial of a number
    System.out.println("PART 3");
    System.out.println(factorial(3));

    // dice rolling

    System.out.println("PART4");
    continueRolling();


}

}
