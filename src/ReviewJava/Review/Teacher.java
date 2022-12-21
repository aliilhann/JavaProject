package ReviewJava.Review;

public class Teacher {
    String name, lastName;
    int experience;
    String subject;
    double salary;

    static String school;
    //how to create a constructor
    //1.constructor name=classname
    //2. no return type not even void

    //using below constructor we initialize instance variables(name, lastname)
    Teacher(String fname, String lname) {
        name=fname;
        lastName=lname;



    }
    void print() {
        System.out.println(" name :" + name + lastName);
    }
}
