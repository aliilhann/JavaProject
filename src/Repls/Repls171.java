package Repls;

public class Repls171 {
    /*Create a Parent Class that will have two overloaded abstract methods m1

Make Main class as concrete subclass to Parent Class

In main method call the methods.

Expected Output:

m1 without parameters
m1 method with parameter


    */
}
abstract class Parent171 {
    abstract void m1();
    abstract void m1(String str);

}
class Main171 extends Parent171 {

    @Override
    void m1() {
        System.out.println("m1 without parameters");
    }

    @Override
    void m1(String str) {
        System.out.println("m1 method with " + str);
    }

    public static void main(String[] args) {
        Main171 main171=new Main171();
        main171.m1();
        main171.m1("parameter");
    }
}