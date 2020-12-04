public class StringLecture {

    public static void main(String[] args) {

// ------ .equals(String anotherString)

        String one = "2";
        String two = "2";
        System.out.println(one.equals(two));

//      DONT USE == TO CHECK VALUE OF STRING
//        System.out.println(one==two);


// ------ .equalsIgnoreCase(String anotherString)

//        String greeting = "howdy";
//        System.out.println(greeting.equalsIgnoreCase("HoWDy"));


// ------ .startsWith(String prefix)

//        String title = "Dr. Doctor";
//        boolean isADoctor = title.toLowerCase().startsWith("dr");
//        System.out.println(isADoctor);


// ------ .endsWith(String suffix)

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup);


// ------ .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
//
//        char firstLetter = word.charAt(0);
//
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
//
//        System.out.println(firstLetterCapitalized);


// ------ .indexOf(String subString)

//        String cat = "cat";
//        System.out.println(cat.indexOf("at"));


// ------ .lastIndexOf(String subString)

//        String good = "Good";
//        System.out.println(good.indexOf("o"));


// ------ .length()

//        String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//        System.out.println(longestWord.length());


// ------ .replace(char oldChar, char newChar)

//        String search = "tiny cats looking cute";
//        String parsedSearch = search.replace("cats", "dogs");
//        System.out.println(parsedSearch);

//                                    []-->optional arg
// ------ .substring(int beginIndex[, int endIndex])
//  where to start and search for the first instance of the match =>(0,6)
//        substring is upto the mentioned index



//        String name = "Justin Bob Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//
//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);

//        String name = "Justin Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String lastName = name.substring(firstName.length() + 1);
//        System.out.println(lastName);


// ------ .toLowerCase() and .toUpperCase()

//        String hello = "hELlo";
////        System.out.println(hello.toUpperCase());
////        System.out.println(hello.toLowerCase());
//        System.out.println(hello);


// ------ .trim()

//        String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.println(trimmedInput);
//
//        System.out.print("|" + input + "|");


// ------ chaining string methods

// convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

        String word1 = "cat";
        String pigLatinWord = word1
            .trim()
                //cat
            .toLowerCase()
                //cat
            .substring(1)
                //at
            .concat(word1.substring(0, 1).toLowerCase())
                //atc
            .concat("ay");
//        atcay
        System.out.println(pigLatinWord);



    }

}
