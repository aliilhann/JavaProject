package JavaClass.class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog1 = new Dog("Tomy", "Black", "German");
        Dog dog2 = new Dog("Jony", "White", "BullDog");
        Dog dog3 = new Dog("Kimi", "Brown", "German");
        dogs.add(new Dog("Paws","grey","germa"));

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        dogs.add(new Dog("Tonu","purple","sheppard"));

        /*dogs.add(new Dog("Tomy", "Black", "German"));
        dogs.add(new Dog("Jony", "White", "BullDog"));
        dogs.add(new Dog("Kimi", "Brown", "German"));*/



        // System.out.println(dogs);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.print(dogs);

    }
}
