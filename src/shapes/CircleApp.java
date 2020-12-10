package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
    Input userRadius=new Input();
    System.out.println("enter a value for radius:");
    double r=userRadius.getDouble();
    Circle circleOne= new Circle(r);
        System.out.printf("The area of the circle is %f: ",circleOne.getArea());
        System.out.printf("The circumference of the circle is %f: ",circleOne.getCircumference());

    }
}
