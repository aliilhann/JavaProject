package Udemy;

public class MethodsReturn {
    static String str(String s, String b) {
        s=s+b;
        return s;
    }

    public static void main(String[] args) {

        System.out.println("the number is " + str("a","v"));
    }
}
