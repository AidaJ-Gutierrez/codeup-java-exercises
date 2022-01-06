//Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle
// using your Input class, creates a Circle object, and displays the circumference and area.
// (Note that you will need to import your Input class.)

package shapes;
import util.Input;



public class CircleApp {
    public static void main (String[] args) {
        Input userRadius = new Input();
        double radius = userRadius.getDouble();

        Circle c1 = new Circle(radius);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());



    }

}
