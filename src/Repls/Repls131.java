package Repls;

public class Repls131 {
    static String thirdLetter(String s) {
        String str = "";
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i += 3) {
            str = str + c[i];
        }

        return str;

    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}