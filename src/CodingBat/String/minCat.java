package CodingBat.String;

public class minCat {
    /*

Given two strings, append them together (known as "concatenation") and return the result.
 However, if the strings are different lengths, omit chars from the longer string
  so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
  The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
     */
    public static String minCat(String a, String b) {
        int length;
        if(a.length()<b.length()) {
            length=a.length();
            return a+b.substring(b.length()-length);
        }else if(b.length()<a.length()) {
            length=b.length();
            return a.substring(a.length()-length)+b;
        } else {
            return a+b;
        }
    }

    public static void main(String[] args) {
        System.out.println(minCat("hello","abcdef"));
    }
}
