package Repls;

public class Repls161 {
}
class Main12 {
    private  void m1() {
        System.out.println("private m1 method");
    }
    private void m1(int a) {
        System.out.println("private m1 method with int parametere");
    }

    public static void main(String[] args) {
       Main12 main=new Main12();
       main.m1();
       main.m1(0);
    }
}
