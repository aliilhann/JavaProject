package JavaClass.Class20;

public class MethodOverLoading {
    static void F1(String name, int number) {
        System.out.println("1");
    }

    static void F1(String name, int number, int number2) {
        System.out.println("2");
    }

    static void F1(int num, int number) {
        System.out.println("3");
    }

    static void F1(int num, String name) {
        System.out.println("4");

    }

    public static void main(String[] args) {
        MethodOverLoading md=new MethodOverLoading();
        md.F1("ali",5);
    }
}