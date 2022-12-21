package JavaClass.class22;

public class HW1 {
}class Student{
    void study(){
        System.out.println("I can study");
    }
    void read(){
        System.out.println("I can read");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("Syntax Students  study Java");
    }

    @Override
    void read() {
        System.out.println("Syntax Students read codes");
    }
    void prepareForInterview(){
        System.out.println("Syntax students get prepared for interviews");
    }
}
class CollegeStudent extends Student{
    @Override
    void study() {
        System.out.println("College students can study Math");
    }

    @Override
    void read() {
        System.out.println("College students read novels");
    }
    void prepareForExams(){
        System.out.println("College students get prepared for exams");
    }
}
class SchoolStudent extends Student{
    @Override
    void study() {
        System.out.println("School students study English" );
    }

    @Override
    void read() {
        System.out.println("School students read books");
    }
    void prepareForTests(){
        System.out.println("School students get prepared for tests");
    }
}

