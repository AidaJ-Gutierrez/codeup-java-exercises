import java.util.Scanner;


public class Warmups {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Java is statically typed, while Javascript is dynamically typed.");


//Dec 16
//In the main method of your warmups  class, as the user "What did you eat for breakfast today?"
        //Use the scanner class to store the input in a variable called "userBreakfast".
        //Lastly, print what the user ate for breakfast, along with a short comment.

        System.out.println("What did you eat for breakfast today?");
        String userBreakfast = scanner.nextLine();
        System.out.printf("That sounds delicious..   %s %n", userBreakfast);

    }
    //January 3rd
    //Create a method called "starDAy" that returns a string with the value of "Brain loading... Done!". Execute
    //your program and print out to the console.
    //2.Add, commit and push your work to Githhub.

    public static String startDay(){

        return  "Brain loading... Done!";

    }
        System.out.println(startDay);

    }

