package JavaClass.class22;

public class AnimalTester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();

        Animal animal2=new Panda();//upcasting
//      Panda panda=new Animal() //down-casting

        Animal[] animals={new Cat(),new Panda()};
        for(Animal animal:animals) {
            animal.eat();
            animal.sleep();
        }

    }
}