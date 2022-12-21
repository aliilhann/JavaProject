package CodingBat.String2;

public class PrefixAgain {
    /*

Given a string, consider the prefix string made of the first N chars of the string.
 Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is
  in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
     */
    public static boolean prefixAgain(String str, int n) {
        String first=str.substring(0,n);
        int count=0;
        for(int i=0; i<=str.length()-n;i++) {
            if(str.substring(i,i+n).equals(first)) {
                count++;
            }
        }
        return (count>=2);
    }

    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc",3));

    }

}
