package Repls;

public class Repls139 {
    public static String alphabetical(String str) {
        String str2=str.charAt(0)+"";

        for(int i=1; i<str.length(); i++) {
           if(str.charAt(i)>str.charAt(i-1)){
               str2+=str.charAt(i);
           }
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));

    }
}