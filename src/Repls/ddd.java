package Repls;

public class ddd {
    public static String alphabetical (String s) {

        s= s.toLowerCase();
        char max=s.charAt(0);
        String result=s.charAt(0)+"";
        for(int i=0; i<s.length(); i++){
            if(max<s.charAt(i)){
                result+=String.valueOf(s.charAt(i));
                max=s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(alphabetical("language"));
    }
}
