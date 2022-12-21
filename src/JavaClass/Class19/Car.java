package JavaClass.Class19;

class vehicle {
    int numOfWheel;
    int topSpeed;

    public void printTopSpeed() {
        System.out.println(topSpeed);
    }
}


public class Car extends vehicle {
    String model;
    String make;
    int year;
    void print() {
        System.out.println(make);
    }

}

class Tesla extends Car{

}
class Toyota extends Car{

}
class Tester {
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.make="toyota";
        toyota.print();
    }
}
