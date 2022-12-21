package Repls;

public class Repls159 {

    public static void main(String[] args) {
     subtract(30,10);
     subtract(50,10,10);
     subtract(60,10,5,5);
    }

    static void subtract(int a, int b) {
        System.out.println(a-b);
    }
    static void subtract(int a, int b, int c) {
        System.out.println(a-b-c);
    }
    static void subtract(int a, int b, int c, int d) {
        System.out.println((a-b-c-d) +" (should come from subtracting 4 numbers)");
    }
}
