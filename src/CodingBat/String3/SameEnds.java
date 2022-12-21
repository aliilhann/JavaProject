package CodingBat.String3;

public class SameEnds {
    /*

Given a string, return the longest substring that appears at both the beginning and end of the
 string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
     */
    public static String sameEnds(String string) {
        String str2="";
        for(int i=0 ;i<string.length()/2+1;i++) {
            if(string.substring(0,i).equals(string.substring(string.length()-i))) {
                str2=string.substring(0,i);
            }
        }

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(sameEnds("abcabc"));
        String str="abXYab";
    //    System.out.println(str.substring(str.length()-1));
    }

}
