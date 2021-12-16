import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);


        System.out.println("Please enter a number.");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber);

        System.out.println("Please enter 3 words.");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.printf("Your three words are: %n %s %n %s %n %s %n", wordOne,wordTwo
        , wordThree);

        System.out.println("Please enter a sentence.");
        scanner.nextLine();
        String sentence = scanner.nextLine();
        System.out.printf("your sentence is : %n %s %n", sentence);

        System.out.println("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter length: ");
        double length = Double.parseDouble(scanner.nextLine());
        double area = width * length;
        double perimeter = (width * 2) + (length * 2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);




    }
}
