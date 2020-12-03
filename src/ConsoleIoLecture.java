import java.util.Scanner;

public class ConsoleIoLecture{

    public static void main(String[] args) {
        /* ***************************************
                    print() and println()
         ****************************************/

// >> this:
//        System.out.println("here");
//        System.out.println("there");

// >> is equivalent to this:
//        System.out.print("here2\n");
//        System.out.print("there2\n");


// >> without the newline characters, print outputs this:
//        System.out.print("here");
//        System.out.print("there");


// >> to concatenate, just like JS:
//        System.out.println("Hello" + " " + "World");


        /* ***************************************
                    printf()/.format
        ****************************************/

        //TODO TOGETHER: Print a formatted string using the following... printf(formatString, data)




        //TODO TOGETHER:
        // (1) Create a string variable

        String name="jaya";
                System.out.printf(name +"%n"+" that's me");
        // (2) print using printf() with placeholder %s



        // TODO: print using printf() with placeholder %S



        //TODO: Remove the %n from the first printf. What do you notice?

        // >>>> Multiple Variables


        //TODO TOGETHER:
        // (1) Create 2 variables - int and string

        int number=1;
       String kids="Mrinal";
       System.out.printf(number+ kids );

        // (2) Print using printf() and placeholders
        // note: d : decimal integer [byte, short, int, long]




        //TODO:
        // (1) Print using printf(), multiple variables, and placeholders
        String family ="KAtterishetty";
        String family1 ="sai";
        String family2 ="Mrinal";
        String family3 ="Jaya";
        System.out.printf("%s,%s,%s"+ "belong to a family" ,family+family1+family2+family3);



        System.out.println();

        // >>>> Currency


        // %f => float/double formatting
        //We can control the precision of the decimal using .___

        //TODO TOGETHER:
        // (1) Create int variable currencyPennies
        // (2) Print variable using currency formatting



        /* ***************************************
                        USER INPUT
        ****************************************/
        // The Scanner class allows us to get data input that the user enters into the console.
        // Scanner Docs ==> http://www.cs.utexas.edu/users/ndale/Scanner.html

//Scanner input=new Scanner(System.in);

// what we need to input is incoming via the console =>system.in


        // >>>> .next() method
        // .next() captures each input usually signified by whitespace. The input is returned as a string




        // >>>> .nextInt() method
        // .nextInt() captures the first valid int value





        // >>>> .nextLine() method
        // .nextLine() Returns the rest of the current line





        /* ****************** NOTE ********************
            *Quirk of using next() then nextLine()...
            *https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
            *
            *That's because the Scanner.nextInt method does not read the newline character in your input created by hitting "Enter,"
            *the call to Scanner.nextLine returns after reading that newline.
            *You will encounter the similar behaviour when you use Scanner.nextLine() after Scanner.next()
            *or any Scanner.nextFoo method (except nextLine itself).
         */

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter your favorite number: ");
//         int num = sc.nextInt();
//         System.out.println(num);
//         System.out.print("Please enter your favorite words: ");
//         String words = sc.nextLine();
//         System.out.println(words);


    }
}
