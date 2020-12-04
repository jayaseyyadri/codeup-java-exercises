import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        for (int i = 0; i <= 100; i++) {
//
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 3 == 0 ) {
//                System.out.println("buzz");
//            } else{
//                    System.out.println(i);
//                }
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go upto?");
        int userNumber = scanner.nextInt();
        for (int i = 0; i <= userNumber; i++) {
            System.out.println(Math.pow(i, 2));
            System.out.println(Math.pow(i, 3));
        }
        System.out.println("Would you like to continue?");
        String userContinue = scanner.next().toLowerCase();
        if (userContinue.equals("yes") || userContinue.equals("y")) {
            System.out.println("What number would you like to go upto?");
        } else {
            System.out.println("Bye!");
        }


    }


}