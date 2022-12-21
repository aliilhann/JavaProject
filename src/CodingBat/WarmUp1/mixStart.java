package CodingBat.WarmUp1;

public class mixStart {
    static boolean mixStart (String str) {
        if(str.substring(1,3).equals("ix")) {
            return true;
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(mixStart("poxt"));
    }
}
