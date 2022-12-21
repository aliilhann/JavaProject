package Repls;

public class Repls165 {
    /*Parent class create 4 methods with different level of access modifiers.
    In each method print "I am parent public/protected/default/private method".

Override methods in child class

In Main Class create object of the child class and see which methods are available

Expected Output:

I am a child public method
I am a child protected method
I am a child default method

     */
}
class Parent165 {
    public void method1() {
        System.out.println("I am parent public method");
    }
    protected void method2() {
        System.out.println("I am parent protected method");
    }
     void method3() {
        System.out.println("I am parent default method");
    }
    private void method4() {
        System.out.println("I am parent private method");
    }
}
class Child165 extends Parent165{
    public void method1() {
        System.out.println("I am child public method");
    }
    protected void method2() {
        System.out.println("I am child protected method");
    }
    void method3() {
        System.out.println("I am child default method");
    }
    private void method4() {
        System.out.println("I am child private method");
    }
}
class Main165 {
    public static void main(String[] args) {
        Child165 child=new Child165();
        child.method1();
        child.method2();
        child.method3();

    }
}
