package CodingBat.WarmUp2;

public class frontTimes {
    /*

Given a string and a non-negative int n,
we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3.
Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static String frontTimes(String str, int n) {
        String str2 = "";
        if (str.length() > 3) {
            for (int i = 0; i < n; i++) {
                str2 = str2 + str.substring(0,3);
            }
            return str2;
        } else {
            for (int i = 0; i < n; i++) {
                str2 = str2 + str.substring(0);

            }return str2;

        }
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("he",4));
    }

    }


