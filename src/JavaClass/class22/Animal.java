package JavaClass.class22;

public class Animal {
    void eat() {
        System.out.println("Animals usually eat plants");
    }
    void sleep() {
        System.out.println("Animals sleep for 8 to 10 hours");
    }

}
class Panda extends Animal {
    @Override
    void eat() {
        System.out.println("Pandas eat bamboos");
    }
    void sleep() {
        System.out.println("Panda sleep for 14 hours");
    }
}
class Cat extends Animal {
    void eat() {
        System.out.println("Cats eat fish");
    }
}