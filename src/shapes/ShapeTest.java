package shapes;

public class ShapeTest {

    public static void main(String[] args) {

        System.out.println("myshape2 - Rectangle ");
        Measurable myShape2 = new Rectangle(4, 5);
        System.out.println("Perimeter: " + myShape2.getPerimeter());
        System.out.println("Area: " + myShape2.getArea());

        System.out.println("------");

        System.out.println("myshape2 - Square ");
        Measurable myShape = new Square(5);
        System.out.println("Perimeter: " + myShape.getPerimeter());
        System.out.println("Area: " + myShape.getArea());




        //Inheritance and Polymorphism
        // Create a variable of the type Rectangle named box1 and assign it a new
        // instance of the Rectangle class with a width of 4 and a length of 5
//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println("Area of box 1 is "
//                + box1.getArea());
//        System.out.println("Perimeter of box 1 is "
//                + box1.getPerimeter());
//
//        // Create a Rectangle object with given set of values variable of the type
//        // Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5
//        Rectangle box2= new Square(5);
//
//        System.out.println("Area of box 2 is "
//                + box2.getArea());
//        System.out.println("Perimeter of box 2 is "
//                + box2.getPerimeter());
    }
}


