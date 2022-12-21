package CodingBat.WarmUp2;

public class StringTimes {

    /*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */
    static public String stringTimes(String str, int n) {
       String str2="";
       for(int i=0 ; i<n ; i++) {
           str2=str2+str;
       }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(stringTimes("hi",3));
    }
}
