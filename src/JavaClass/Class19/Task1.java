package JavaClass.Class19;

public class Task1 {
    public static void main(String[] args) {
        Student student=new Student("Ali","odessa");
        student.displayInfo();

    }

}
class Student {
    static String name;
    static String address;

    Student(String name, String address) {
        this.name=name;
        this.address=address;
    }
    void displayInfo() {
        System.out.println(name + " ," + address);
    }


}

