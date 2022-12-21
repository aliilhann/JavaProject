package JavaClass.class22;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
for(Student s: students) {
    s.read();
    s.study();

}
       new SyntaxStudent().prepareForInterview();
        new CollegeStudent().prepareForExams();
        new SchoolStudent().prepareForTests();
    }

}

