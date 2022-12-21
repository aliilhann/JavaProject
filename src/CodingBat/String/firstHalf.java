package CodingBat.String;

public class firstHalf {
    /*

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc
     */
    public static String firstHalf(String str) {
        String str2=str.substring(0,str.length()/2);

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(firstHalf("WooWoo"));
    }
}
