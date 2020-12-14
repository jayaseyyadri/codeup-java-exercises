package shapes;
public class Square extends Rectangle{
    protected int oneSideOfSquare;

    public Square(int side) {
        super(side, side);
        oneSideOfSquare = side;
    }

    //super(length,width) from Rectangle

    public int getArea(){
        return (int)Math.pow(oneSideOfSquare,2);
}
public int getPerimeter(){
        return 4*oneSideOfSquare;
}
}
