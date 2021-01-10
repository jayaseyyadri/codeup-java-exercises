public class StringPractice {

    /**
     * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty
     */


    public String comboString(String a, String b) {
        int smallString = a.length();
        int bigString = b.length();
        if (smallString > bigString) {
            return b + a + b;
        } else {
            return a + b + a;
        }

    }
}