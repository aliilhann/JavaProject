package JavaClass.Class18;

public class Cat extends Animal {

    public Cat(String catName, String catBreed, int catAge, double catWeight) {
     name=catName;
     breed=catBreed;
     age=catAge;
     weight=catWeight;

    }
    public void printInfo() {
        System.out.println("Name "+ name + " breed "+ breed + " age "+ age);
    }

}
