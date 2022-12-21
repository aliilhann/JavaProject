package JavaClass.Class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name,String color,int age,double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo() {
        System.out.println("Name " + name + " Color " + color + " Age " + age + " Weight " + weight);

    }

}
class Parrot extends Bird{
    Parrot(String name, String color, int age, double weight) {
       super(name,color,age,weight);

    }
}
class Crow extends Bird {
    Crow(String name, String color, int age, double weight) {
        super(name,color,age,weight);
       /* this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;*/
    }
}
class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green",2,1);
        parrot.printInfo();
        Crow crow=new Crow("Ali","hola",5,1);
        crow.printInfo();
        Sparrow sparrow=new Sparrow("sparrow","black",5,1);
        sparrow.printInfo();
    }
}
class Sparrow extends Bird {

    Sparrow(String name, String color, int age,double weight) {
        super(name, color, age,weight);


    }
}