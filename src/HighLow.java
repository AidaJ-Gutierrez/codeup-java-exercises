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
    ////Use the random method of the java.lang.Math class to generate a random number.
    //Bonus
    ////Keep track of how many guesses a user makes.
    //Set an upper limit on the number of guesses.


    public static void main(String args[]) {
      Scanner scanner= new Scanner(System.in);
      int randomNumber = (int) (Math.random() * (100-1) + 1);
      boolean guess = false;
      do {
          int userNumb= MethodsExercises.getInteger(1 ,100);
          if (userNumb == randomNumber){
              System.out.println("GOOD GUESS!");
              guess =true;
          }else if (userNumb > randomNumber){
              System.out.println("LOWER");
          }else if(userNumb < randomNumber){
              System.out.println("HIGHER");
          }else{
              System.out.println("Oooops!");
          }
      }while(!guess);
    }
}


