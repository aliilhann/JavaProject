package CodingBat.WarmUp2;

public class doubleX {
    /*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
     */
   static boolean doubleX(String str) {
       int i=str.indexOf("x");
       if(i==-1) {
           return false;
       }
       String str2=str.substring(i);
       return str2.startsWith("xx");
    }

    public static void main(String[] args) {
        System.out.println(doubleX("abcdxxv"));


    }
}