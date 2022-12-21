package JavaClass.Class18;

public class Car {
    String model;
    String make;
    int year;
    String color;
    int toSpeed;
    double price;
    void print() {
        System.out.println("model "+ model + " make "+ make+ " color "+ color);
    }
}
 class BMW extends Car {
    double engineCC;

}

class Tesla extends Car {
}


class Toyota extends Car {

}
class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.model="x5M";
        bmw.make="BMW";
        bmw.color="Black";
        bmw.print();


    }



}
