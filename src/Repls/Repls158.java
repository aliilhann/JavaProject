package Repls;

public class Repls158 {
    String city;
    Repls158(String city) {
        this.city=city;

    }
    public void display() {
        System.out.println("City name "+ city);
    }
}
class Child5 extends Repls158{
    Child5(String city) {
        super(city);
    }
}
class main15 {
    public static void main(String[] args) {
        Child5 child=new Child5("Fairfax");
        child.display();
    }
}
