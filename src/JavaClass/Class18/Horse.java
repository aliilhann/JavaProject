package JavaClass.Class18;

public class Horse {
    String name;
    String breed;
    int age;
    double weight;

    public Horse(String name, String breed, int age, double weight) {
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.weight=weight;


    }
    void printInfo() {
        System.out.println("name  "+ name + " breed "+ breed + " age "+ age);
    }

    public static void main(String[] args) {
        Horse horse1=new Horse("Spirit", "Arabian",20,400);
        horse1.printInfo();

    }


}
