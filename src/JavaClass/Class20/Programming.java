package JavaClass.Class20;

public class Programming {
    Programming () {
        System.out.println( "I love programming languages");
    }
    Programming(String name) {
        System.out.println("I love "+ name);

    }

    public static void main(String[] args) {
        Programming programming=new Programming();
        Programming programming2=new Programming("Java");

    }
}
