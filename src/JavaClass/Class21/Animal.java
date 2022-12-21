package JavaClass.Class21;

public class Animal {

    void sleep() {
        System.out.println("Animals usually sleep for 6 hours");
    }
}
class Cat extends Animal {

    void sleep() {
        System.out.println("Cats sleep 20 hours");
    }
}
class Dog extends Animal {

    void sleep(String name) {
        System.out.println(name+ " sleep 15 hours");
    }
}
class Animaltester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sleep("Lucy");
    }
}