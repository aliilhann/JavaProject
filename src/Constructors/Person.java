package Constructors;

public class Person {
    String name;
    String job;
    int age;
    void print() {
        System.out.println("His name is "+ name + " his job is " +job+ " his age is "+ age);
    }
    public Person(String newName) {
       name=newName;
    }
    private Person(String newName, String newJob, int newAge){
    name=newName;
    job=newJob;
    age=newAge;
    }
    Person(String newName, String newJob) {
      name=newName;
      job=newJob;
    }
    protected Person(String newName, int newAge) {
      name=newName;
      age=newAge;
    }

    public static void main(String[] args) {
        Person person1=new Person("aLex");
        Person person2=new Person("oLiver", "IT", 25);
        Person person3=new Person("gabrieL", "Author");
        Person person4=new Person("danieL",40);
        person1.print();
        person2.print();
        person3.print();
        person4.print();




    }

}
