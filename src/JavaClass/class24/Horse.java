package JavaClass.class24;

public class Horse {
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;

    public Horse(String name, String breed, int age, double weight, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
       setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {

        return color;
    }
    public void setColor(String color) {
        if (!color.equals("Red")) {
            System.out.println("That is not our horse");
        } else {


        } this.color = color;
    }
    void print() {
        System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight +" color "+ color);
    }
}
class horseTest {
    public static void main(String[] args) {
        Horse horse=new Horse("Molly","Arabian",10,1000,"white");
        horse.print();
    }
}