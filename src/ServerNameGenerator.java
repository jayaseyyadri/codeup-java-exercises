import java.util.Random;

public class ServerNameGenerator {

   public static String[] adjectives = {"Pickled", "sweet", "Slippery", "Squeaking", "Ambidextrous", "Jazzy", "Loud", "Easy", "red", "chill"};
   public static String[] nouns = {"paris", "coding", "cheese", "bread", "job", "puppy", "beach", "Cody", "book", "ball"};


    public static String nameGenerator(String[] words) {
        Random random =new Random();
       int  randomIndex =random.nextInt(words.length);
       return  words[randomIndex];
    }



    public static void main(String[] args) {
        System.out.println("Server Name : ");
        System.out.println(nameGenerator(adjectives) +" " +nameGenerator(nouns));
    }



}