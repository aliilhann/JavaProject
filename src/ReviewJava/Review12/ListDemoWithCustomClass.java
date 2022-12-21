package ReviewJava.Review12;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("ali","ilhan","123"));
        students.add(new Student("ahmet","gonzales","456"));
        students.add(new Student("miley","erica","789"));
        students.add(new Student("Hohn","ho","123"));

        System.out.println(students);

        for (Student student : students) {
            student.printName();

        }
        Student student=new Student("abc","def","123");

students.add(student);
        System.out.println(students);
    }


}


