package Udemy;

public class MethodsReturn5 {
    static void skorhesapla(String name, int score) {
        System.out.println(name + " has "+ score + " score");

    }
    static void skorhesapla(String name) {
        System.out.println(name + "'score is not known");
    }
    static void skorhesapla(int score) {
        System.out.println("Unknown player has "+ score + " score");
    }

    public static void main(String[] args) {
        skorhesapla(17);
        skorhesapla("ali");
        skorhesapla("ali",5);
    }
}
