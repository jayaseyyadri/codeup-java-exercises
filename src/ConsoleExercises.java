import java.sql.SQLOutput;
import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f", pi);

        Scanner userInput=new Scanner(System.in);
//        System.out.println("enter an integer");
//        // if not an integer throws an error
//        int userNumber= userInput.nextInt();
//
//        System.out.println("Enter three words");
//
//        System.out.println("Enter first word");
//        String wordOne=userInput.next();
//        System.out.println("Enter second word");
//        String wordTwo=userInput.next();
//        System.out.println("Enter third word");
//        String wordThree=userInput.next();
//
//        System.out.println(wordOne) ;
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

            // more than 3 1st three followed by space
            // less than 3 it doesnt finish till we input minimum 3
//        System.out.println("Enter a sentence");
//        String userSentence = userInput.next();
//        System.out.println(userSentence);
//        String userSentence = userInput.nextLine();
//        System.out.println(userSentence);

        System.out.println("Enter the length of the rectangle");
        int length=Integer.parseInt(userInput.nextLine());
        System.out.println("Enter the width of thr rectangle ");
        int width=Integer.parseInt(userInput.nextLine());
        System.out.printf("The area of the rectangle is : %d \n" +
                "The perimeter of the rectangle is %d " ,length*width,2*length+2*width);






    }
}
