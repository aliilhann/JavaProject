package Repls;

public class Repls162 {
    /*Overload static method and then execute both overloaded methods.

Expected Output:

static method without parameter
static method with int parameter */
}
class Main162 {
    public static void main(String[] args) {
        print();
        print(0);

    }
    static void print() {
        System.out.println("static method without parameter");
    }
    static void print(int number) {
        System.out.println("static method with int parameter");
    }
}
