package shapes;

public class ShapesTest {

    public static void main(String [] args){
//Square myShape=new Square(5);
//        System.out.println(myShape.getArea());
//        Rectangle myShape2=new Rectangle(6,7);
//        System.out.println(myShape2);

        Measurable myShape =new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape= new Rectangle(20,30);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
    }
}
