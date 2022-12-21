package ClassObject;

public class Dog {

    String name;
    String color;
    String breed;
    double weight;
    int age;

    //These are the behaviours of the dog.
    void bark() {
        System.out.println("Barking....");
    }

    void sleep() {
        System.out.println("Dog is sleeping....");
    }

    public static void main(String[] args) {

        //creating objects from a class
        Dog dog1 = new Dog();         //new keywords helps us to create an object

        //calling a behaviour from a class
        dog1.bark();
        dog1.sleep();
    }
}