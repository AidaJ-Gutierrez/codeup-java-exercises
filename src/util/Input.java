//Create an input validation class
//
//Create a package inside of src named util. Inside of util, create a class named Input that has a private
// field named scanner. When an instance of this object is created, the scanner field should be set to a
// new instance of the Scanner class. The class should have the following methods, all of which return
// command line input from the user:
//
package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Please enter something.");
        String userResponse = scanner.nextLine();
        System.out.printf("You have entered: %s", userResponse);
        return userResponse;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String userResponse = scanner.nextLine();
        System.out.printf("You have entered: %s", userResponse);
        return userResponse;
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue?");
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Please enter a whole number between %d and %d. \n", min, max);
        int userNum = scanner.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userNum = scanner.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt() {
        System.out.println("Please enter a whole number.");
        int userNum = scanner.nextInt();
        System.out.printf("You chose %d", userNum);
        return userNum;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Please enter a number between %f and %f. \n", min, max);
        double userNum = scanner.nextDouble();
        if (userNum > max || userNum < min) {
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userNum = scanner.nextDouble();
        if (userNum > max || userNum < min) {
            return getDouble(min, max);
        }
        return userNum;
    }

    public double getDouble() {
        System.out.println("Please enter a number.");
        double userNum = scanner.nextDouble();
        System.out.printf("You chose: %f", userNum);
        return userNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userNum = scanner.nextDouble();
        System.out.printf("You chose: %f", userNum);
        return userNum;
    }



}

//------------------------------------------------------------------------------
//package util;
//
//import java.util.Scanner;
//
//public class Input {
//    private Scanner sc = new Scanner(System.in);
//
//
//   public String getString(){
//       System.out.println("Type something");
//       String input = sc.nextLine();
//       return input;
//   }
//
//   public boolean yesNo(){
//       System.out.println("Would you want to continue? yes or no?");
//       String yesNo = sc.nextLine();
//
//       if (yesNo.contains("y") || yesNo.contains("Y")){
//           return true;
//       }else{
//           return false;
//       }
//   }
//public int getInt(int min, int max){
//
//    boolean addInt = true;
//    do{       //user prompt
//        System.out.println("Enter a number between " + min + " and " + max + ": ");
//        int userInput = sc.nextInt();
//        sc.nextLine();
//
//        //if statement to check int is in range
//        if (userInput >=min && userInput <=max) {
//            return userInput;
//        }else{
//            System.out.println("That number is not in range!!! Please try again.");
//            return getInt(min, max);
//        }
//    }while (addInt);
//   }
//   public int getInt(){
//         System.out.println("Enter an int.");
//        int userInput;
//        try {
//            userInput = Integer.parseInt(sc.nextLine());
//        } catch (NumberFormatException e){
//            System.out.println("Is not a ");
//
//   public double getDouble(double min, double max){
//       boolean doubleInt = true;
//       do{       //user prompt
//           System.out.println("Enter any number between " + min + " and " + max + ": ");
//           double doubleInput = sc.nextDouble();
//           sc.nextLine();
//
//           //if statement to check int is in range
//           if (doubleInput >=min && doubleInput <=max) {
//               return doubleInput;
//           }else{
//               System.out.println("That number is not in range!!! Please try again.");
//               return getDouble(min, max);
//           }
//       }while (doubleInt);
//
//   }
//
//   public double getDouble(){
//       return this.sc.nextInt();
//   }
//
//
//    //Bonus
//   // Allow all of your methods for getting input to accept an optional String parameter named prompt.
//    // If passed, the method should show the given prompt to the user before parsing the input.
//
//
//
////COPIED TO InputTest.java
//    public static void main(String[] args) {
//       Input input = new Input();
////        System.out.println(input.getString());
////        System.out.println(input.yesNo());
////        System.out.println(input.getInt(1,10));
//////        System.out.println(input.getInt());
////        System.out.println(input.getDouble(1,10));
//////        System.out.println(input.getDouble());
//  }
//
//}
//
//    private void getDouble() {
//    }