package Repls;

public class Repls178 {
    /*
    Create Class EncapsulationDemo

create two variable as shown below.

private String empName;

private int empAge;

Create the getter/setter methods for each variable.

In Main Class and main method.

Using setter methods assign the values as "John" and "30"

Using getter methods print the values as below outputs.
     */
}
    class EncapsulationDemo {
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
class Main178 {
    public static void main(String[] args) {
        EncapsulationDemo encapsulation=new EncapsulationDemo();
        encapsulation.setEmpName("John");
        encapsulation.setEmpAge(30);
        System.out.println("Employee Name: " +encapsulation.getEmpName());
        System.out.println("Employee Age: " +encapsulation.getEmpAge());

    }
}
