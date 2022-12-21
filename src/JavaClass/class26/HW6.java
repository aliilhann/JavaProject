package JavaClass.class26;

import java.util.HashSet;

public class HW6 {
    public static void main(String[] args) {
        Student1 student1=new Student1("mark",123);
        Student2 student2=new Student2("aLi",456);
        Student3 student3=new Student3("meLinda",789);

        HashSet<Student> students=new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for(var student:students) {
            String names=student.name;
            System.out.println(names);
        }
    }
}
class Student {
    String name;
    int ID;

    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }
}
class Student1 extends Student {
    public Student1(String name, int ID) {
        super(name, ID);
    }
}
class Student2 extends Student {
    public Student2(String name, int ID) {
        super(name, ID);
    }
}
class Student3 extends Student {
    public Student3(String name, int ID) {
        super(name, ID);
    }
}