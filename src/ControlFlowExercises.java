import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

Scanner scanner= new Scanner(System.in);
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
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        boolean wantToContinue = true;
        do {
            System.out.println("Enter marks scored ");
            int marks = scanner.nextInt();

            if ( marks >= 88 ||marks <= 100 ){
                System.out.println("You secured A");
            }else if(marks >=80 || marks <= 87){
                System.out.println("You secured B" );
            }else if(marks >=67 || marks<= 79 ){
                System.out.println("You secured C" );
            }else if(marks >= 60 || marks <=66) {
                System.out.println("You secured D");
            }else if(marks >= 0 || marks >=59){
                    System.out.println("You secured E" );
            }else{
                System.out.println("Enter a valid number ");
            }

//            B : 87 - 80
//            C : 79 - 67
//            D : 66 - 60
//            F : 59 - 0


        }while(wantToContinue);


        }
}