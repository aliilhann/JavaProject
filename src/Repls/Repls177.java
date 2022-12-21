package Repls;

public class Repls177 {
    /*
    **** Follow Steps Carefully**

Step 1: Create Interface as Outputs

Step 2: Create one method with below details

First Methods: return type void, method name display, parameters -> result (choose the datatype as required)
Step 3: Create Interface as Functions

Step 4: Inherit to Outputs

Step 5: Create 4 methods as below.

return type double, method label adding, parameters -> firstNumber , SecondNumber (choose the datatype as required)
return type double, method label subtracting, parameters -> firstNumber , SecondNumber (choose the datatype as required)
return type double, method label multiply, parameters -> firstNumber , SecondNumber (choose the datatype as required)
return type double, method label dividing, parameters -> firstNumber , SecondNumber (choose the datatype as required)
Step 6: In Main Class inherit to Functions Interface.

Step 7: Provide implementation logic to unimplemented methods.

Step 8: complete the body of all the methods as below

Display method to print the result parameter as shown below in Outputs.
Adding, Subtracting, Multiply, dividing each will have the logics to do simple mathematic operation and return the result.
Step 9: Create the main method inside the main method declare below variables.

double firstNumber = 100.00;
double secondNumber = 20.00;
Step 10: Instantiate the object of Main class and call the methods one by one to print the result and sequence of shown below in output.
     */
}

interface Output {
    void display(Double str);
}

interface Functions extends Output {
    double adding(double firstNumber, double SecondNumber);

    double subtracting(double firstNumber, double SecondNumber);

    double multiply(double firstNumber, double SecondNumber);

    double dividing(double firstNumber, double SecondNumber);
}

class Main177 implements Functions {

    @Override
    public void display(Double str) {
        System.out.println("Result is ::: " + str);
    }

    @Override
    public double adding(double firstNumber, double SecondNumber) {
        double sum = firstNumber + SecondNumber;
        return sum;
    }

    @Override
    public double subtracting(double firstNumber, double SecondNumber) {
        double difference = firstNumber - SecondNumber;
        return difference;
    }

    @Override
    public double multiply(double firstNumber, double SecondNumber) {
        double product = firstNumber * SecondNumber;
        return product;
    }

    @Override
    public double dividing(double firstNumber, double SecondNumber) {
        double quotient = firstNumber / SecondNumber;
        return quotient;
    }

    public static void main(String[] args) {
        double firstNumber = 100.00;
        double secondNumber = 20.00;

        Main177 main = new Main177();

        main.display(main.adding(firstNumber, secondNumber));
        main.display(main.subtracting(100.00, 20.00));
        main.display(main.multiply(100.00, 20.00));
        main.display(main.dividing(100.00, 20.00));

/*
        main.display("Result is ::: ");
        System.out.println(main.subtracting(100.00,20.00));
        main.display("Result is ::: ");
        System.out.println( main.multiply(100.00,20.00));
        main.display("Result is ::: ");
        System.out.println(  main.dividing(100.00,20.00));


 */

    }


}

