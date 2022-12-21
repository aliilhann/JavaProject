package Repls;

public interface Repls176 {
}
interface ParentInterface {
    void parentMethod();
}
interface ChildInterface extends ParentInterface {
    void childMethod();
}
class Main176 implements ChildInterface{

    @Override
    public void parentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        ChildInterface childInterface=new Main176();
        childInterface.parentMethod();
        childInterface.childMethod();
    }
}
