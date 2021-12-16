import java.util.Random;
import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1.
//a. While loop
        int i = 5;
        while( i <= 15){
            System.out.print(i + " ");
            i++;
        }


// b. Do-While loop
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Follow each number with a new line.
        int count = 0;

        do {
            System.out.println(count);
                count += 0;
                count = count + 2;

        }while(count <= 100);


        //Alter your loop to count backwards by 5's from 100 to -10.
        int reverseCount =100;

        do {
            System.out.println(reverseCount);
            reverseCount -= 5;


        }while(reverseCount >= 0);

        //Create a do-while loop that starts at 2, and displays the number squared
        // on each line while the number is less than 1,000,000. Output should equal:

//        long squareCount = 2L;
//        do{
//            System.out.println(squareCount);
//            squareCount *= squareCount;
//
//        }while(squareCount < 1000000L);


//c. For loop
        //Refactor the previous two exercises to use a for loop instead.

        for (long squareCount = 2L; squareCount < 1000000L; squareCount *= squareCount) {
            System.out.println(squareCount);
        }
//2. FizzBuzz
        for (int f = 1; f <= 100; f++) {
            if (f % 5 == 0 && f % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (f % 5 == 0) {
                System.out.println("Buzz");
            } else if (f % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(f);
            }

        }

//3. Display a table of powers.
        boolean continueAddNumber = true;

do {
    System.out.println("What number would you like to go up to?");
    int userNumber = scanner.nextInt();
    System.out.println("%n Here is your table! %n");
    System.out.println(" number | squared | cubed");
    System.out.println("------- | ------- | -----");
    for (int n = 1; n <= userNumber; n++){
    System.out.printf("%d\t\t| %d  \t  | %d\t", n ,  n*n , n*n*n);
        System.out.println();
    }
    System.out.println("Would you like to continue?( y / n)");
    String userConfirm = scanner.next();
    if(!userConfirm.equalsIgnoreCase("y")){
        continueAddNumber = false;
    }
}while(continueAddNumber);

//4. Convert given number grades into letter grades.
        boolean grades = true;

        do {
            System.out.println("Please enter the  grade in integer form, from 0 - 100: ");
            int userGrade = scanner.nextInt();
            if(userGrade >= 88){
                System.out.println("A");
            }else if(userGrade >= 80){
                System.out.println("B");
            }else if(userGrade >= 67){
                System.out.println("C");
            }else if(userGrade >= 60){
                System.out.println("D");
            }else{
                System.out.println("F");
            }

            System.out.println("Do you what to ente a new grade? (y/n)");
            String newGrade  = scanner.next();
             if (!newGrade.equalsIgnoreCase("y")){
                 grades = false;
             }
        }while(grades);

//Bonus
//
//Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).


    }
}
