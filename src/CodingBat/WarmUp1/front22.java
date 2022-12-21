package CodingBat.WarmUp1;

public class front22 {
    /*
    Given a string, take the first 2 chars and return the string with
    the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
    If the string length is less than 2, use whatever chars are there.
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
     */
   static public String front22(String str) {
        if (str.length() >= 2) {
            String str2 = str.substring(0, 2);
            return str2 + str + str2;
        }else {
            return str+str+str;
        }
    }

    public static void main(String[] args) {
       System.out.println(front22("kitten"));
    }
}