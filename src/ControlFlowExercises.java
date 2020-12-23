import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        for(int i=5 ;i<=15;i++ ){
//        System.out.print(i+" " );
//    }
//        for(int i=0 ;i<=100;i=i+2 ){
//        System.out.println(i);
//    }
//
//        for (float i = 2; i < 1000000; i *= i) {
//
//            System.out.printf("%.0f%n", i);
//        }

        //FizzBuzz
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}