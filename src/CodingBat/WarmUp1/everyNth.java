package CodingBat.WarmUp1;

public class everyNth {
    static String str2="";
    static public String everyNth(String str, int n) {
        for (int i = 0; i < str.length(); i += n)  {
          str2=str2+(str.charAt(i));
        }return str2;
    }


    public static void main(String[] args) {
        System.out.println(everyNth("abcdeef",2));



    }
}
