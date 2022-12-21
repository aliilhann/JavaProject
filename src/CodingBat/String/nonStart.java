package CodingBat.String;

public class nonStart {
    /*
    Given 2 strings, return their concatenation,
     except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
     */
    public static String nonStart(String a, String b) {
        String str=a.substring(1);
        String str2=b.substring(1);

        return str+str2;

    }

    public static void main(String[] args) {
        System.out.println(nonStart("Hello","There"));
    }

}
