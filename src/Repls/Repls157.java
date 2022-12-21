package Repls;

public class Repls157 {

}
class Parent6 {
    void m1() {
        System.out.println("m1 method in parent class");
    }
}
class Child6 extends Parent6{

    void m1() {
        System.out.println("m1 method in child class");
    }
    void m2() {
        super.m1();
    }

}
class Main6 {
    public static void main(String[] args) {
        Child6 child=new Child6();
        child.m1();
        child.m2();
    }
}
