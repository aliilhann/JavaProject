package CodingBat.String;

public class withoutEnd {

  /*

Given a string, return a version without the first and last char,
so "Hello" yields "ell". The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
   */
  public static void main(String[] args) {
    System.out.println(withoutEnd("Hello"));
  }
  public static String withoutEnd(String str) {
    String str2=str.substring(1,str.length()-1);
    if(str.length()<2) {
      return str;
    }else {
      return str2;
    }

  }
}
