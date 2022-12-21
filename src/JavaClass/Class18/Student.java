package JavaClass.Class18;



public class Student {
    String name;
    String address;

    void displayInfo() {
        System.out.println("Student name is "+ name + " and the address is "+ address);
    }
    Student(String name, String address) {
        this.name=name;
        this.address=address;
    }

    public static void main(String[] args) {
       Student student1= new Student("aLi","Odessa, TX");
       student1.displayInfo();

    }
}
