import java.util.Scanner;

public class adventureGame {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello , welcome to adventure game !\n Would you like to start ?");
        String userContinue=scanner.next();
        while(userContinue.equals("yes")){
            System.out.println("LET THE ADVENTURE BEGIN");
            System.out.println("First, what is your name? ");
            String userName=scanner.next();
            System.out.println("ok,"+userName + "get ready");

            }

        }

    }

