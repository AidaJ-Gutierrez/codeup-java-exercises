package shapes;

public class Square extends Quadrilateral{

    protected double side;

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }


    //Inheritance and Polymorphism exercise:

//  public double side;
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
//        System.out.println("This is the area of the square");
//        return this.length * this.width;
//    }

}





