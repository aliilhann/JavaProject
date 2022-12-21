package CodingBat.String;

public class firstTwo {
    /*
    Given a string, return the string made of its first two chars, so the String "Hello" yields "He".
    If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
    yields the empty string "". Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
     */
    public static String firstTwo(String str) {
        if(str.length()>=2) {
            String str2=str.substring(0,2);
            return str2;
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(firstTwo("Hello"));
    }
}
