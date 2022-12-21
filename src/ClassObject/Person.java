package ClassObject;

public class Person {

    String name;
    int age;
    double weight;
    boolean isFunny;

    public void study() {
        if(name.equals("ali")) {
            System.out.println("I will keep on deleting the messages");
        }
        else if(name.equals("Roman")) {
            System.out.println("I study hard");
        }else {
            System.out.println("I try to study but things do not make sense");
        }
    }

    public static void main(String[] args) {
        Person person1= new Person();

        person1.name="ali";
        person1.study();


        Person person2=new Person();
        person2.name="Roman";
        person2.study();
    }
}
