package JavaClass.class24;

public class Cat {
    String name;
    String breed;
    int age;
    double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Please enter name");
        } else {

        }  this.name = name;
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

    public Cat(String name, String breed, int age, double weight) {
        setName(name);
        setAge(age);
        setBreed(breed);
        setWeight(weight);
    }
}
