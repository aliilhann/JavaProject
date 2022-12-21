package CodingBat.String2;

public class ZipZap {
    /*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
 Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
     */
    public static String zipZap(String str) {
        String str2="";
        for(int i=0; i<str.length()-2;i++) {
            if(str.substring(i,i+1).equals("z") && str.substring(i+2,i+3).equals("p")) {
                str2+=str.substring(i,i+1)+str.substring(i+2,i+3);
                i+=2;
            }else {
                str2+=str.substring(i,i+1);
            }
        }
        /*
        String str2="";
        for(int i=0; i<str.length()-2; i++) {
            if(str.charAt(i)=='z' && str.charAt(i+2)=='p') {
                str2+=str.charAt(i)+str.charAt(i+2);
                System.out.println(str2);
            }else {
                str2+=str.charAt(i);
            }
        }

        return str2;

         */
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        String a="a.bcdefd";
        System.out.println(a.replaceAll("\\."," "));
    }

}
