package JavaClass.Class19;

public class Animal {
    String name;
    String breed;
    String color;

    public  Animal(String name, String breed, String color){
        this.name=name;
        this.breed=breed;
        this.color=color;
    }

    public void info() {
        System.out.println("Name "+ name + " breed "+ breed + " color "+ color);
    }
}
class Dog2 extends Animal {
    public Dog2(String name, String breed, String color) {
        super(name, breed, color);
    }

}
class Cat2 extends Animal {
    public Cat2(String name, String breed, String color) {
        super(name, breed, color);
    }

}
class TestAnimal2 {
    public static void main(String[] args) {
        Dog2 dog2=new Dog2("javky","persian","white");
        dog2.info();
    }
}