package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

public Rectangle(int length,int width){
    super(length,width);
}

    @Override
    public double getPerimeter() {
        return (2*this.length)+(2*this.width);
    }

    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    void setLength(int length) {
    this.length=length;
    }

    @Override
    void setWidth(int width) {
    this.width=width;

    }
}
