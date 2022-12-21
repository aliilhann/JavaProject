package ReviewJava.Review;

public class teachers {

    String name;
    int experience;
    String subject;
    double salary;

    teachers(String name, int experience, String subject, double salary)  //constructor example
    {
        this.name=name;
        this.experience=experience;
        this.subject=subject;
        this.salary=salary;


    }
    void print() {
        System.out.println(name + " ," + experience + "," + subject + "," + salary);
    }
    void info() {
        this.print();

    }

    public static void main(String[] args) {
        teachers teacher= new teachers("ali",5,"math",100000); //calling a constructor
        teacher.print();                                //calling a mthod

        teachers teacher2 =new teachers("riza", 5,"biology",34500);
        teacher2.print();
    }
}
