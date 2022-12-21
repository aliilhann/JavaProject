package Repls;

public interface Repls174 {
}
interface MyInterface {
    void method1();
    void method2();
}
class Main174 implements MyInterface {

         @Override
         public void method1() {
            System.out.println("implementation of method1");
        }
        @Override
        public void method2() {
            System.out.println("implementation of method2");

        }

    public static void main(String[] args) {
        MyInterface myInterface=new Main174();
        myInterface.method1();
        myInterface.method2();
    }

}