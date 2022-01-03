import java.util.Scanner;

public class ControlStructureAndLoopsExtraExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Write a program in Java to read 10 numbers from keyboard and find their sum and average
        //Expected Output :
        //The sum of 10 numbers is : 55
        //The Average is : 5.500000

        float sum =0;
       float avg =0;

        System.out.println("Enter any ten numbers: ");
        for(int k= 1; k<=10; k++){
            int nums= scanner.nextInt();
            sum += nums;
            avg = sum/10;
        }

        System.out.println("The sum of your 10 numbers is : " + sum);
        System.out.printf("The average is : " + avg);


        System.out.println();
        //2.Write a program in Java to display the cube of the number upto given an integer.
        // Read the number using the Scanner class.
        //Expected Output :
        //Number is : 1 and cube of the 1 is :1
        //Number is : 2 and cube of the 2 is :8
        //Number is : 3 and cube of the 3 is :27
        //Number is : 4 and cube of the 4 is :64
        //Number is : 5 and cube of the 5 is :125

        System.out.println("Please enter a number: ");
        int newNum = scanner.nextInt();
        int cubeInt = (int) Math.pow(newNum, 3);
        System.out.println("Here is your number cubed: " + cubeInt);

        System.out.println();
        //3.Write a program in Java to display the n terms of odd natural number and their sum.
        // Read the odd number using the Scanner class
        //Test Data
        //Input number of terms : 10
        //Expected Output :
        //The odd numbers are :1 3 5 7 9 11 13 15 17 19
        //The Sum of odd Natural Number upto 10 terms : 100



        //4.Write a program in Java to display the pattern like right angle triangle with a number.
        // Read the number using the Scanner class.
        //The pattern like :
        //
        //1
        //12
        //123
        //123

        //5.Write a program in Java to make such a pattern like right angle triangle with number increased by 1.
        //With an input of 10.
        //The pattern must look like :
        //
        //   1
        //   2 3
        //   4 5 6
        //   7 8 9 10






    }

}
