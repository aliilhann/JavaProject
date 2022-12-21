package Constructors;

public class Dog {
     String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge>30) {
            System.out.println("Please enter a valid value");
        } else {
            age = dogAge;
        }
        weight=dogWeight;
    }


    void printInfo() {
        System.out.println("name "+ name + " breed "+ breed + ""+age) ;
    }

    public static void main(String[] args) {
        Dog dog=new Dog("Tomy", "Huskey", "Pink",35,45.2);
        Dog dog2=new Dog("Lucy", "Kangal", "Pink",10,45.2);
        dog.printInfo();
        dog2.printInfo();
        //dog.name="Lucy";
        //dog.breed="Kangal";
        //dog.color="White";
        //dog.age=12;
        //dog.weight=43.5;
        //dog.printInfo();


    }
}
