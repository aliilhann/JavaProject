package Repls;

public class Repls180 {
   /*
   Create Class EncapsulationDemo

create two variable as shown below.

private String empName=John;

private int empAge=30;

Create only getters methods for each variable.

Print the values of each variable as shown below.

Expected Output:

Employee Name: John
Employee Age: 30
    */
}
class EncapsulationDemo3 {
    private String empName="John";
    private int empAge=30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }


}
class Main180 {
    public static void main(String[] args) {
        EncapsulationDemo3 encapsulation=new EncapsulationDemo3();
        String name=encapsulation.getEmpName();
        int age=encapsulation.getEmpAge();
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Age: "+ age);
    }

}
