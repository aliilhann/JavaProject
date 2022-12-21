package Repls;

public class Repls163 {
    /*In Parent Class create a method with name method() that will print "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.

Expected Output:

Parent method
Child method*/
}
class Parent163 {
    void method() {
        System.out.println("Parent method");
    }
}
class child163 extends Parent163 {
    void method() {
        System.out.println("Child method");

    }
}
class main163 {
    public static void main(String[] args) {
        Parent163 parent=new Parent163();
        parent.method();
        child163 child=new child163();
        child.method();
    }
}
