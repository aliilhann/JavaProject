package CodingBat.String3;

public class MirrorEnds {
    /*

Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string,
and at the very end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
     */
    public static String mirrorEnds(String string) {
        String str2="";
        for(int i=0; i< string.length();i++) {
            if(string.substring(i,i+1).equals(string.substring(string.length()-i-1,string.length()-i))) {
                str2+=string.substring(i,i+1);
            }else {
                break;
            }
        }


        return str2;
    }
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abcggxba"));

    }

}
