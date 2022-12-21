package JavaClass.Class19;

public class Parent {
    String city;
    Parent(String city) {
      this.city=city;
    }
    Parent() {

    }
    void print() {
        System.out.println(city);
    }
}
class Child extends Parent{

    Child(String city) {
        super(city);
    }
}
class main11 {
    public static void main(String[] args) {
        Child child=new Child("Vienna");
        child.print();
    }
}

