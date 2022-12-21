package ClassObject;

public class Employee {

    String name;
    String department;
    String id;
    double salary;
    String shift;

    void work() {
        System.out.println(name+ " is working on shift "+ shift);
    }
    void takeLeaves() {
        System.out.println(name+ " is going on leaves "+ shift);
    }

    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.name="aLi";
        emp1.department="IT";
        emp1.id="123";
        emp1.salary=145000;
        emp1.shift="Evening";
        emp1.work();

        Employee emp2=new Employee();
        emp2.name="riza";
        emp2.id="12344";
        emp2.department="Math";
        emp2.salary=13456;
        emp2.shift="Morning";
        emp2.takeLeaves();


    }
}
