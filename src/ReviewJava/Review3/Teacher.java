package ReviewJava.Review3;

public class Teacher {
    String name, lname;
    String subject;
    int experience;
    double salary;
    static String school;

    Teacher(String name, String lname, String subject) {
        this(name, lname);
        this.subject = subject;
    }

    Teacher(String name, String lname) {
        this.name = name;
        this.lname = lname;
    }

    Teacher(String name, String lname, int experience) {
        this(name, lname);
        this.experience = experience;

    }
    public void print() {

        System.out.println("Teacher name "+ name + " "+ lname );
    }
    void teach() {
        this.print();
        System.out.println(name +" teaches "+ subject);
    }
    static void work () {

        System.out.println("All teachers work at "+ school);
    }
    double getBonus() {
        if(experience<5) {
            return 3;
        }else {

        }return 3.5;
    }

}
class School {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("John", "Smith");
        System.out.println(teacher.name);
        Teacher t2=new Teacher("Jane", "frost", "math");
        t2.getBonus();

    }
}
