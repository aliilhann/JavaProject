package CodingBat.String2;

public class StartOut {
    /*

    Return a version of the given string, where for every star (*) in the string the star and the chars
     immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

    starOut("ab*cd") → "ad"
    starOut("ab**cd") → "ad"
    starOut("sm*eilly") → "silly"
     */
    public static String starOut(String str) {
        String str3="";
        for(int i=0 ; i<str.length();i ++) {
            if(str.charAt(i)=='*' || (i>0 && str.charAt(i-1)=='*'))

                continue;
            if(i<str.length()-1 && str.charAt(i+1)=='*')
                continue;

            str3+=str.charAt(i);
        }

// str.replaceAll("(\\w?\\*\\w?)", "");

        return str3;
    }
    public static void main(String[] args) {
        System.out.println(starOut("a*bb*njm*"));
    }
    /*
     String str2="";
        if(str.length()<2) {
            if(str.equals("*")) {
                return "";
            }else {
                return str;
            }
        }
      for(int i=0; i<str.length();i++) {
          if(i==0 &&  (str.charAt(1)=='*' || str.charAt(0)=='*'))
          continue;
          if(i>0 && i<str.length()-1 && ((str.charAt(i)=='*')|| str.charAt(i+1)=='*'))
          continue;
          if(i>0 && i<str.length() && ((str.charAt(i)=='*')|| str.charAt(i-1)=='*' ))
              continue;

          str2+=str.charAt(i);
     */
}