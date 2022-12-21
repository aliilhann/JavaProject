package JavaClass.Class19;

public class Main10 {
    public static void main(String[] args) {
        Employee employee=new Employee("Joe","Smith",35,35000);
        Student2 student=new Student2("Adam","Smith",15,10);
        Retiree retiree=new Retiree("Frank","Smith",15,"tour");
        employee.print();
        student.print();
        retiree.print();


    }
}
class Person{
    String name;
    String lastName;
    int age;

    Person(String name,String lastName,int age) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
  // void print() {
      // System.out.println(name+lastName+age);

  // }
}
class Employee extends Person{
    int salary;
    Employee(String name, String lastName, int age, int salary) {
        super(name, lastName, age);
        this.salary=salary;
    }
    void print() {
        System.out.println(name+" "+lastName+" "+ age+" "+salary);

    }
}
class Student2 extends Person {
       int grade;
    Student2(String name, String lastName, int age, int grade) {
        super(name, lastName, age);
        this.grade=grade;
    }
    void print() {
        System.out.println(name+" "+lastName+" "+ age+" "+grade);

    }

}
class Retiree extends Person{
      String activity;
    Retiree(String name, String lastName, int age, String activity) {
        super(name, lastName, age);
        this.activity=activity;
    }
    void print() {
        System.out.println(name+" "+lastName+" "+ age+" "+activity);

    }
}
