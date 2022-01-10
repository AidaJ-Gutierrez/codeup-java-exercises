package shapes;

public class Square extends Quadrilateral{

    protected double side;

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public void setWidth(double width) {

    }


    //Inheritance and Polymorphism
//    public Square(double side){
//        super(side, side);
//    }
//
//
//    public double getPerimeter() {
//        System.out.println("This is the perimeter of square:");
//        return 4 * this.length;
//    }
//
//
//    public double getArea() {
//        System.out.println("This is the are of the square");
//        return this.length * this.width;
//    }

}





