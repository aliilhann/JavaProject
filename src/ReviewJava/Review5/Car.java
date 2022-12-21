package ReviewJava.Review5;

abstract public class Car {
    String color,make,model;

    public Car(String color, String make, String model) {
        this.make = make;
        this.model = model;
        this.color = color;
    }
    void drive() {
        System.out.println("All cars can be driven");
    }
    abstract void start();
    abstract void stop();
}
class Tesla extends Car {

    public Tesla(String color, String make, String model) {
        super(color, make, model);
    }

    @Override
    void start() {
        System.out.println("can start");
    }

    @Override
    void stop() {

    }


}