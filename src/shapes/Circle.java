//Circle class
//
//Inside of src, create a package named shapes. Inside of shapes, create a class named Circle.
// This class should have a private radius field that is set through the constructor,
// and various methods for getting information about the circle, detailed below.


package shapes;

public class Circle {
    private double radius;


    private static int createCircles= 1;

    public Circle(double rad){
        radius = rad;
        trackCircle();
    }
    public double getArea(){
        return (2 * Math.PI * radius);
    }
    public double getCircumference(){
        return (Math.PI * radius * radius);
    }
    public static int trackCircle(){
        createCircles++;
        return createCircles;
    }


    public static void main (String[] args){}



//
//    Bonus
//
//    After a circle is created, use the yesNo method of your Input class and ask the user if they would like
//    to make another. Continue creating circles and displaying information about them until the user says
//    they do not want to continue.
//
//    Before exiting, the program should output the total number of circles created. Use a private static field,
//    along with a public static method to keep track of and display the total number of circles created.

}
