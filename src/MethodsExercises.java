import org.w3c.dom.ls.LSOutput;

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
    public static double substraction(double num1, double num2){
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





//2.Create a method that validates that user input is in a certain range
////The method signature should look like this:
//
//public static int getInteger(int min, int max);
//
// and is used like this:
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);


//If the input is invalid, prompt the user again.
////Hint: recursion might be helpful here!


//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between" + min + "and" + max + ": ");
//        int userInput = scanner.nextInt();
//    }








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

public static void main(String [] args){
        // 1.arithmetic

    System.out.println("part 1");
    System.out.println(addition(6,6));
    System.out.println(substraction(6,6));
    System.out.println(multiplication(6,6));
    System.out.println(division(6,3));
    System.out.println(modulus(6,6));

}

}
