package ClassObject;

public class Student {

        String name;
        String ID;
        int age;
        double weight;
        char gender;

        void deleteMessages() {
            System.out.println("Deleting messages");
        }
        void study() {
            System.out.println("Student is studying");
        }
        void eat() {
            System.out.println("Eating pizza......");
        }

    public static void main(String[] args) {

            Student student1= new Student();
            student1.name="aLi";
            student1.ID="123";
            student1.age=23;
            student1.study();

          System.out.println(student1.name);
          System.out.println(student1.age);
          student1.study();
        System.out.println("************");
          Student student2= new Student();
          student2.name="riza";
          student2.age=33;
          student2.weight=76.3;
          student2.gender='M';
        System.out.println(student2.name);
          student2.eat();
    }
}
