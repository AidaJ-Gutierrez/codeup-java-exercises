//Create an input validation class
//
//Create a package inside of src named util. Inside of util, create a class named Input that has a private
// field named scanner. When an instance of this object is created, the scanner field should be set to a
// new instance of the Scanner class. The class should have the following methods, all of which return
// command line input from the user:

package util;

import java.util.Scanner;
public class Input {
    private Scanner sc = new Scanner(System.in);


   public String getString(){
       System.out.println("Type something");
       String input = sc.nextLine();
       return input;
   }

   public boolean yesNo(){
       System.out.println("type yes or no");
       String yesNo = sc.nextLine();

       if (yesNo.contains("y") || yesNo.contains("Y")){
           return true;
       }else{
           return false;
       }
   }
public int getInt(int min, int max){

    boolean addInt = true;
    do{       //user prompt
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInput = sc.nextInt();
        sc.nextLine();

        //if statement to check int is in range
        if (userInput >=min && userInput <=max) {
            return userInput;
        }else{
            System.out.println("That number is not in range!!! Please try again.");
            return getInt(min, max);
        }
    }while (addInt);
   }
//   public int getInt(){
//       System.out.println("Type any integer");
//        int userInt = sc.nextInt();
//        return getInt();
//   }

   public double getDouble(double min, double max){
       boolean doubleInt = true;
       do{       //user prompt
           System.out.println("Enter any number between " + min + " and " + max + ": ");
           double doubleInput = sc.nextDouble();
           sc.nextLine();

           //if statement to check int is in range
           if (doubleInput >=min && doubleInput <=max) {
               return doubleInput;
           }else{
               System.out.println("That number is not in range!!! Please try again.");
               return getDouble(min, max);
           }
       }while (doubleInt);




   }





//   public double getDouble(){1
//       System.out.println("Type any number with decimals");
//       double doubleDoubleInput = sc.nextDouble();
//      return getDouble();
//   }


    //Bonus

   // Allow all of your methods for getting input to accept an optional String parameter named prompt.
    // If passed, the method should show the given prompt to the user before parsing the input.



//COPIED TO InputTest.java
//    public static void main(String[] args) {
//       Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.yesNo());
//        System.out.println(input.getInt(1,10));
////        System.out.println(input.getInt());
//        System.out.println(input.getDouble(1,10));
////        System.out.println(input.getDouble());
//    }

//}
