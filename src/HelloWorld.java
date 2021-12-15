public class HelloWorld {
    public static void main(String[] args){
        System.out.print("Hello ");
        System.out.println("World!");

        int myFavoriteNumber = 7;
//shortcut control shift R to run the program
        System.out.println(myFavoriteNumber);

//        "The most difficult thing is the decision to act. The rest is merely tenacity."
        String myString ="3.14159"; // it prints out the number as a string

        System.out.println(myString);

//        char myChar = 'a';

        float myNumber = 3.14f; // prints out illegal  state of expression when nothing is assigned
        //When (long) is not added it show an error, after (long) is cast the printout is 3
        // changing it to 123L will print just 123, also assigning 123 will print 123.

        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // to help the compiler and to specify that these variables are a data type


        //declaring it as a float, prints out an error// adding f at the end will fix it
        // the second solution will be casting to our float:
        // float myNumber =(float) 3.14;

        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//          add 1 after the number has been print
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //adds 1 to the number before is been printed

//        String class = 2; // reserved keyword error

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//run time error, we can not assign an int to a string



//        int three = (int) "three";// incompatible types-error- string cannot be converted to int


    //Rewrite the following expressions using the relevant shorthand assignment operators:
        // int x = 4;
        //x = x + 5;
//                int x = 4;
//                x += 5;

        //int x = 3;
        //int y = 4;
        //y = y * x;
//                int x = 3;
//                int y = 4;
//                y *= x;


        //int x = 10;
        //int y = 2;
        //x = x / y;
        //y = y - x;
                int x =20;
                int y = 2;
                x/=y;
                y-=x;


                //What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

        // we will get a compile error :

        System.out.println(Integer.MAX_VALUE);

    }
}

