package ReviewJava.Review;

public class Shelter {
    public static void main(String[] args) {

        Dog.breed="huskey";
        Dog dog1 = new Dog();
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();


        Dog dog2 = new Dog();

        dog2.name="Tommy";
        dog2.weight=60;

        dog2.printInfo();
        System.out.println("********");
        dog1.name="Bob";
        dog1.breed="ggg";
        dog1.printInfo();

        double price=dog1.price();
        System.out.println(price);

        double price2=dog2.price();
        System.out.println(price2);

        String bark= dog1.bark();
        System.out.println(bark);
        String bark1= dog2.bark();
        System.out.println(bark1);

        String str="hello";
        str.length();
        str.substring(3);

        dog1.love(" to walk");
        dog2.love(" to play");
    }
}
