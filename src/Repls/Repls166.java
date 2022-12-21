package Repls;

public class Repls166 {
}
class Animal {
    String name;
    String food;

    Animal(String name, String food) {
        this.name=name;
        this.food=food;
    }
    void eat() {
        System.out.println(name +" eats");
    }
    void sleep() {

    }
}
class Cat extends Animal {

    Cat(String name, String food) {
        super(name, food);
    }
    void sleep() {
        System.out.println(name + " sleeps a lot");
    }
}
class Kitten1 extends Cat{

    Kitten1(String name, String food) {
        super(name, food);
    }
    void eat() {
        System.out.println(name + " eats "+ food);
    }
}
class Kitten2 extends Cat{

    Kitten2(String name, String food) {
        super(name, food);
    }
    void eat() {
        System.out.println(name + " eats "+ food);
    }
}
class Kitten3 extends Cat{

    Kitten3(String name, String food) {
        super(name, food);
    }
    void eat() {
        System.out.println(name + " eats "+ food);
    }
}
class main166 {
    public static void main(String[] args) {
        Animal[] animal={new Cat("Cat",""),new Kitten1("kitten1","milk")
                ,new Kitten2("kitten2","snacks"), new Kitten3("kitten3","everything")};

        for(Animal a:animal) {
            a.eat();
            a.sleep();
        }

    }
}