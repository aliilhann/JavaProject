package Repls;

public class Repls170 {
    /*Overload 2 final instance methods:

Call them in main method

Expected Output:

Final method with boolean parameter
Final method with String parameter

     */
     final void name(boolean b) {
        System.out.println("Final method with boolean parameter");
    }

     final void name(String str) {
        System.out.println("Final method with String  parameter");
    }

    public static void main(String[] args) {
        Repls170 repls170=new Repls170();
        repls170.name("a");
        repls170.name(true);
    }

}