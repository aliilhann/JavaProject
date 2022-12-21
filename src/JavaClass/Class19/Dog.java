package JavaClass.Class19;

public class Dog extends Animal {
    public Dog(String name, String breed, String color) {
        super(name,breed,color);
    }


}
class Cat extends Animal {

    public Cat(String name, String breed, String color) {
       super(name,breed,color);
    }

}

class TestAnimal{
    public static void main(String[] args) {
        Dog dog=new Dog("jacky","German","Green");
        dog.info();
    }
}
