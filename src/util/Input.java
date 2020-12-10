package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner ;
    private boolean isY;
    private int min;
    private int max;

public Input(){
    //can use this too  & we put it in a constructo so tht it doesn't wait in the backgroun
    scanner= new Scanner(System.in);
}


public String getString(){
    System.out.println("enter a string");
return this.scanner.nextLine();
}

public boolean yesNo(){

    if (this.scanner.next().equalsIgnoreCase("y")||this.scanner.next().equalsIgnoreCase("yes"))
    {
        this.isY=true;
    }
    return isY=false;
}


    public int getInt(){
        System.out.println("enter an integer");
        return this.scanner.nextInt();
    }

public int getInt(int min,int max){
        System.out.printf("Enter an integer between %d and %d ", min , max);
           int userNumber=this.scanner.nextInt();
            if(userNumber > max || userNumber<min){
                System.out.println("please enter within the range");
                return getInt(min,max);
            }
return userNumber;
}

 /*        do{
    sout(pass a min & max
    userNumber=scanner.nextInt()
               } while(userNumber < min || userNumber < max );*/


    public double getDouble(){
        System.out.println("enter a double");
        return scanner.nextDouble();

    }

public double getDouble(double min, double max) {
    System.out.printf("Enter a decimal between %f and %f ", min, max);
    int userNumber2= scanner.nextInt();
    if (userNumber2 > max || userNumber2 < min) {
        System.out.println("please enter a number within the range");
       return getDouble(min,max);
    }
    return getDouble();
}


}
