package ReviewJava.Review;

public class Cat {
    String name;              //instance variable
    int weight;               //instance variable
    static String breed;      //static variable



    void printInfo() //void method without return without parameter
    {
        System.out.println(name + " ,"+ weight + " ,"+ breed ) ;
    }

    void love(String thing)  //void method without return with parameter
    {
        System.out.println( name + " loves "+ thing);
    }
    int calculatePrice() {
        if(weight<5) {
            return 100;
        }else if(weight<20) {
            return 200;
        }else {
            return 300;
        }

    }
    Cat() {

    }

    public static void main(String[] args) {
        Cat.breed="huskey";     //to access the static variable, just call the class name

        Cat cat1= new Cat(); //is an object      but Cat() is a constructor. constructor is same as class name and has no return
        cat1.name="kedi";
       cat1.weight=5;
       cat1.printInfo();
       cat1.love("play");

       Cat cat2= new Cat();
       cat2.name="bob";
       cat2.weight=50;
       cat2.printInfo();
       cat2.calculatePrice();
       cat2.love("sleep");

       System.out.println(cat1.calculatePrice());



    }



}
