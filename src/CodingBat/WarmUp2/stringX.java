package CodingBat.WarmUp2;

public class stringX {
    /*
    Given a string, return a version where all the "x" have been removed.
    Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
     */
    public static String stringX(String str) {
        String first="";
        String end="";
        if(str.length()>=1) {
           first = str.substring(0, 1);
        }
        if(str.length()>=1) {
          end = str.substring(str.length() - 1);
        }
        if(str.length()>=2) {
            String str2=str.substring(1,str.length()-1);
            str2=str2.replace("x","");
            return first+str2+end;
        }


        return first;
    }

    public static void main(String[] args) {
        System.out.println(stringX(""));

    }
}
