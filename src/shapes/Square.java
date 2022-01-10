package shapes;

public class Square extends  Rectangle{

    public Square(double side){
        super(side, side);
    }


    public double getPerimeter() {
        System.out.println("This is the perimeter of square:");
        return 4 * this.length;
    }


    public double getArea() {
        System.out.println("This is the are of the square");
        return this.length * this.width;
    }

}





