package ReviewJava.Review;

public class Dog {
    String name;
    int weight;
    static String breed; //static

    void printInfo() {
        System.out.println("Dog features : " + name + " ," + weight + ", " + breed);
    }

    void love(String thing) {
        System.out.println(name + " loves" + thing);
    }
    double price() {
        if (weight < 5) {
            return 100;
        } else if (weight < 10) {
            return 200;
        } else {
            return 1000;
        }

    }
    String bark() {
        String noise;
        if(weight<5) {
            noise="loud";
        }else if (weight<20) {
            noise="woof woof";
        }else {
            noise= "Gav gav";
        }return noise;
    }

    //create a method that will return a bark type

}
    //variable syntax
    //dataType name
    //String   breed;
    //****
    //method syntax
    //returnType       name
    //void           printInfo



