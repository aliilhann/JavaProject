package CodingBat.String2;

public class MixString {
    /*

Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */
    public static String mixString(String a, String b) {
        int min = Math.min(a.length(),b.length());

        System.out.println(min);
        System.out.println(a.substring(a.length()));
        String str2="";
       if(a.length()<b.length()) {
           for(int i=0 ;i<a.length();i++) {

               str2+=a.charAt(i)+""+b.charAt(i);
           }
           return str2+b.substring(a.length());
       }else if(b.length()<a.length()) {
           for(int i=0 ;i<b.length();i++) {

               str2+=b.charAt(i)+""+a.charAt(i);
           }
           return str2+a.substring(b.length());

       }else {
           for(int i=0 ;i<a.length();i++) {

           str2+=a.charAt(i)+""+b.charAt(i);
           }
       }

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(mixString("Hi","There"));
    }

}
