package Repls;

public class Repls214 {
    /*
    Create a custom Exception class

In main class create a method that will check students grade

if students grade is >90 then below exception should be thrown

if students grade is below 90 print "You are a great student"

In main method calls method gradeCheck and handle an Exception

**Expected Output:**

```
SyntaxStudentException: You are an exceptionally awesome student
     */
    public static void main(String[] args) throws SyntaxStudentException {
        method(98);

    }
    public static void method(int grade)  {

            try {if(grade>90) throw new SyntaxStudentException();
                System.out.println("You are a great student");
            }catch (Exception e) {
                System.out.println("SyntaxStudentException: You are an exceptionally awesome student");
                e.printStackTrace();
            }
        }
    }

class SyntaxStudentException extends Exception{
    public SyntaxStudentException() {


    }

}
