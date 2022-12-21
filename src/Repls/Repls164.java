package Repls;

public class Repls164 {
    /*Create a method hello() in parent class that will print "method in Parent class" then
     override that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"

In Main Class create 3 object of the child classes and store in into an array and call method hello():

Expected Output:

method in Child1 class
method in Child2 class
method in Child3 class

     */
    public static void main(String[] args) {
        Parent164[] parents= {new Child11(), new Child12(), new Child13()};
        for(Parent164 parent: parents) {
            parent.hello();
        }
    }
}
class Parent164 {
    void hello() {
        System.out.println("method in Parent class");
    }
}
class Child11 extends Parent164{
    void hello() {
        System.out.println("method in Child1 class");
    }
}
class Child12 extends Parent164{
    void hello() {
        System.out.println("method in Child2 class");
    }
}
class Child13 extends Parent164{
    void hello() {
        System.out.println("method in Child3 class");
    }
}