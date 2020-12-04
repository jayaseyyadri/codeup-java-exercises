import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello Bob!\n");
        boolean talk = true;
        do {
            System.out.println("Would you like to talk today ?");
            String response = scanner.nextLine();

            String bobAnswer = "Sure.";
            String bobYelledAt = "Whoa ,chill out!";
            String bobAngry = "Fine.Be that way";
            String bobOtherwise = "Whatever";

            if (response.equals("no")) {
                break;
            }
            if (response.endsWith("?")) {
                System.out.println(bobAnswer);
            } else if (response.endsWith("!")) {
                System.out.println(bobYelledAt);
            } else if (response.isBlank()) {
                System.out.println(bobAngry);
            } else {
                System.out.println(bobOtherwise);
            }
        } while (talk);
    }
}