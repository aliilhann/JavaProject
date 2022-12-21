package JavaClass.Class18;

public class Dog extends Animal {
    String color;
    double height;

    public Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;

    }
        public Dog(String name, String color, String breed, int age, double weight, double height) {
            this(name, color, breed, age, weight);
           this.height=height;


    }


}
