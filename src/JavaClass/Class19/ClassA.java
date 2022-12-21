package JavaClass.Class19;

public class ClassA {
    static String name;
    ClassA(String name){
        this.name=name;
    }
    static void printF() {
        System.out.println("Hello from"+ name);
    }
}
class ClassB extends ClassA{

    ClassB(String name) {
        super(name);
    }
}
class TestClass {
    public static void main(String[] args) {
        ClassB classB=new ClassB("Class B inherited from A");
        classB.printF();
    }
}

