package JavaClass.Class21;

public class Parent {

    void getMarry() {
        System.out.println("He will get married");
    }

}
class Child extends Parent{

    void getMarry() {
        System.out.println("I wont get married");
    }
}
class parentTester {
    public static void main(String[] args) {


    Child child=new Child();
   child.getMarry();
}
}