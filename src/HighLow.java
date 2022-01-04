import java.util.Scanner;

import java.util.Random;

public class HighLow {


    //Game Development 101
    //
    //Welcome to the world of game development!
    //
    //You are going to build a high-low guessing game. Create a class named HighLow inside of src.
    //
    //The specs for the game are:
    //
    //Game picks a random number between 1 and 100.
    //Prompts user to guess the number.
    //All user inputs are validated.
    //If user's guess is less than the number, it outputs "HIGHER".
    //If user's guess is more than the number, it outputs "LOWER".
    //If a user guesses the number, the game should declare "GOOD GUESS!"
    //Hints
    //
    //Use the random method of the java.lang.Math class to generate a random number.
    //Bonus
    //
    //Keep track of how many guesses a user makes.
    //Set an upper limit on the number of guesses.
    public static void userPrompt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello do you want to play? You need to guess the number I picked between 1 and 100!");
      int userInput = scanner.nextInt();
    }


    public static int randomNumbers(){
// create instance of Random class
        Random rand = new Random();
        // Generate random integers in range 0 to 999
        int rand_int = rand.nextInt(100);

        System.out.println("Random Integer: "+rand_int);
        return randomNumbers();
    }
    public static void main(String args[]) {
        randomNumbers();

    }
}


