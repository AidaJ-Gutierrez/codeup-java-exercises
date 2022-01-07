package shapes;

public class ShapeTest {

    public static void main(String[] args) {
        // Create a variable of the type Rectangle named box1 and assign it a new
        // instance of the Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(5,4);

        System.out.println("Area of box 1 is "
                + box1.getArea());
        System.out.println("Perimeter of box 1 is "
                + box1.getPerimeter());

        // Create a Rectangle object with given set of valuesvariable of the type
        // Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5
        Square box2= new Square(5);

        System.out.println("Area of box 2 is "
                + box2.getArea());
        System.out.println("Perimeter of box 2 is "
                + box2.getPerimeter());
    }
}


