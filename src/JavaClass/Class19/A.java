package JavaClass.Class19;

public class A {
    String name;
    String country;
    String color;
    A(String name, String country, String color){
        this.name=name;
        this.country=country;
        this.color=color;
    }void printInfo() {
        System.out.println("Name is "+ name + " country "+ country + " color "+ color );
    }
}class B extends A {
    B(String name, String country,  String color) {
        super(name, country,  color);
    }
}
class C extends B {
    C(String name, String country, String color) {
        super(name, country, color);
    }
}
class Test2 {
    public static void main(String[] args) {
        A a=new A("Class A","Turkiye","purple");
        B b=new B("Class B","Mexico","Red");
        a.printInfo();
        b.printInfo();
    }
}

