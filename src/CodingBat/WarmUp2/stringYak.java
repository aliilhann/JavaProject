package CodingBat.WarmUp2;

public class stringYak {
    /*
    Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed,
    but the "a" can be any char. The "yak" strings will not overlap.
stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"
     */
    public static String stringYak(String str) {
      for(int i=0; i<str.length()-2 ; i++) {
          if(str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            str=str.replace(str.substring(i,i+3),"");
          }
      }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(stringYak(""));
    }
}

