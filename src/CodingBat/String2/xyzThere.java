package CodingBat.String2;

public class xyzThere {
    /*

Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
     */
    public static boolean xyzThere(String str) {
        if(str.length()==3 && str.equals("xyz")) {
            return true;
        }

        for(int i=0; i<str.length()-3;i++) {
            if(str.charAt(0)=='x'  && str.charAt(1)=='y' && str.charAt(2)=='z') {
              //  System.out.println(str.charAt(0));
                return true;
            }
              else  if (str.charAt(i) != '.' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'y' && str.charAt(i + 3) == 'z') {
                    return true;
                }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(xyzThere("xyz"));

    }
}
