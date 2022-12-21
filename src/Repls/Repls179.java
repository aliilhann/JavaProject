package Repls;

public class Repls179 {
    /*
    Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.

In Main Class and main method

Using setter methods assign the values as "Mario" and "32"

Using getter methods print the values as below outputs.

 **Expected Output:**

```
Employee Name: Mario
Employee Age: 32
     */
}
class EncapsulationDemo2 {
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
class Main179 {
    public static void main(String[] args) {
        EncapsulationDemo2 encapsulation=new EncapsulationDemo2();
        encapsulation.setEmpName("Mario");
        encapsulation.setEmpAge(32);
        String name=encapsulation.getEmpName();
        int age=encapsulation.getEmpAge();
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Age: "+ age);
    }
}

