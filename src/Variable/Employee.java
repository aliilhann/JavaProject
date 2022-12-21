package Variable;

public class Employee {
      String empID;
      double salary;
      static String CEO="Sumair";
    public static void main(String[] args) {
      Employee emp=new Employee();
      emp.empID="ali";
      emp.salary=100000;

        System.out.println(Employee.CEO);

    }
}
