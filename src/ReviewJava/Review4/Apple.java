package ReviewJava.Review4;

public class Apple  extends Fruits {
    String size;
    String taste;
    public Apple(String name, String shape, String color, String size) {
        super(name, shape, color);
        this.size=size;
    }

    public Apple(String name, String size, String taste) {
        super(name);
        this.size = size;
        this.taste = taste;
    }

    public Apple(String name, String shape, String color, String size, String taste) {
        super(name, shape, color);
        this.size = size;
        this.taste = taste;
    }

    void makeJuice() {
       System.out.println("from "+ name+ " we can make "+ taste + " juice");
   }
    void grow() {
        System.out.println("All fruits gg fresh "+ fresh);
    }


    public static void main(String[] args) {
        Apple apple=new Apple("a","b","c");


    }
}
