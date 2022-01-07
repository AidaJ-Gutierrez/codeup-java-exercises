package shapes;

public class Rectangle {
protected double length;
protected double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    public Rectangle(double l, double w){
        length = l;
        width = w;
    }



    public double getArea(){
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }


}
