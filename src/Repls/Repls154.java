package Repls;

public class Repls154 {
    int number;
    Repls154() {

    }
    void printinfo() {
        System.out.println("Parent Constructor without argument");
    }
    Repls154(int number) {
        this.number=number;

    }
    void printNumber() {
        System.out.println(number);
    }
}
class Child3 extends Repls154{
    Child3() {

    }
    void print() {
        System.out.println("Child Constructor without argument");
    }
    Child3(int number) {
       super(number);
    }
}
class main14 {
    public static void main(String[] args) {
        Child3 child1=new Child3();
        Child3 child2=new Child3(10);
        child1.printinfo();
        child1.print();
        System.out.println(child2.number);
    }
}
