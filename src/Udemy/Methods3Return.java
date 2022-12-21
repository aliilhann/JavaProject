package Udemy;

public class Methods3Return {
    static int sum(int a, int b, int c) {
        return (a+b+c);
    }
    static int sum(int a, int b) {
        return (a + b);
    }
        static int number ( int a){
            return a;
        }
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(5, 6, (sum(6,7))));
        System.out.println(4);


    }
}
