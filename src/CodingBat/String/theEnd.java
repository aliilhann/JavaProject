package CodingBat.String;

public class theEnd {
    /*

Given a string, return a string length 1 from its front,
 unless front is false, in which case return a string length 1 from its back.
  The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
     */
    public static String theEnd(String str, boolean front) {
        String str2=str.substring(0,1);
        String str3=str.substring(str.length()-1);

        if(front) {
            return str2;
        }else {
            return str3;
        }

    }

    public static void main(String[] args) {
        System.out.println(theEnd("Hello",false));
    }

}
