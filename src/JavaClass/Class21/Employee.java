package JavaClass.Class21;

public class Employee {

   void calculatesalary() {
       System.out.println("1");
   }

}
class Developer extends Employee{
    void calculatesalary() {
        System.out.println("2");
      super.calculatesalary();

    }

}
class Test {
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.calculatesalary();


    }
}