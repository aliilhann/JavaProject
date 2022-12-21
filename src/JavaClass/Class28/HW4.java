package JavaClass.Class28;

import java.util.TreeMap;

public class HW4 {

}
class Person {
   private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void printDetails() {
        System.out.println("Name : "+ name + " Last Name : "+lastName + " Age : "+age+ " Salary : "+salary);
    }
}
class Test {
    public static void main(String[] args) {
        TreeMap<String,Person> map=new TreeMap<>();
        map.put("A123",new Person("yuceL","gray",33,100000));
        map.put("B456",new Person("miLey","ramirez",28,120000));
        map.put("A678",new Person("LeyLa","gonzaLez",25,130000));
        map.put("A893",new Person("Luis","saLazar",38,110000));

      for(String key: map.keySet()) {
          map.get(key).printDetails();

      }













    }

}
