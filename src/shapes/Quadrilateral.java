package shapes;

 abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    abstract void setLength(int length);
    abstract void setWidth(int width);

     public int getWidth(int width) {
        return this.width=width;
    }

     public int getLength(int length) {
         return this.length=length;
     }

public Quadrilateral(int length,int width){
this.length=length;
this.width=width;
}


}

