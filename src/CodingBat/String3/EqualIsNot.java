package CodingBat.String3;

public class EqualIsNot {
    /*

Given a string, return true if the number of appearances of "is" anywhere in the string is
 equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
     */
    public static boolean equalIsNot(String str) {
        int sum=0;
        for(int i=0; i<str.length()-2;i++) {
            if(str.substring(i,i+2).equals("is")) {
                sum++;
            }if(str.substring(i,i+3).equals("not")) {
                sum--;
            }
        }if(str.length()>=2 && str.substring(str.length()-2).equals("is"))
            sum++;
        return sum==0;
        // return str.split("is",-1).length == str.split("not",-1).length;
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

}
