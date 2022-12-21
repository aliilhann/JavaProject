package Repls;

public class Repls220 {
    /*
    Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits ther should be dash("-")
if there are any spaces in the input remove those
     */
    public static String formatString(String S) {

        String result = "";
        int count = 0;
        for (char i : S.toCharArray()) {
            if (i >= 48 && i <= 57) {
                if (count == 3) {
                    count = 0;
                    result = result.concat("-");
                }
                result = result.concat(String.valueOf(i));
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(formatString("00-44 48 555555"));
    }
}