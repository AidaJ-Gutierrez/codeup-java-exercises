package shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width *2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

}

    //Inheritance and Polymorphism
//protected double length;
//protected double width;
//
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }



