package ClassObject;

public class Phone {

    String make;
    String model;
    String color;
    int storage;
    double size;
    boolean cheap;
    void call() {
        System.out.println("calling....");
    }
    void takePictures() {
        System.out.println("Taking pictures");
    }

    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.make="Apple";
        iphone.model="Iphone 14";
        iphone.color="Black";
        iphone.storage=128;
        iphone.size=5.5;
        iphone.cheap=false;
        System.out.println("Make "+iphone.make + " Model "+ iphone.model);
        iphone.call();
        System.out.println("************");

        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="S22 Ultra";
        samsung.color="White";
        samsung.storage=256;
        samsung.size=4.8;
        samsung.cheap=true;

        System.out.println(iphone.make);
        System.out.println(samsung.make);
    }
}

