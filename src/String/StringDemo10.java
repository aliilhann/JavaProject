package String;

import java.util.Arrays;

public class StringDemo10 {
    public static void main(String[] args) {
        String str="Today is Monday";
        char c=str.charAt(7);
        System.out.println(str.charAt(4));
        System.out.println(c);

        char[] charArray=str.toCharArray();
        System.out.println(charArray);
        System.out.println(Arrays.toString(charArray)); //print out all characters
        System.out.println(str.indexOf("a"));
    }
}
