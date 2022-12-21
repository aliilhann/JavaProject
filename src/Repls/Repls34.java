package Repls;

import java.util.Scanner;

public class Repls34 {
    /*
    Write a program to find the largest number among three distinct numbers using nested if condition

Please use Scanner class to take input from users

Expected Output:

Please enter 3 distinct numbers 4 5  and 14
The largest number is 14
     */
    public static void main(String[] args) {
        System.out.println("Please enter 3 distinct numbers");
        Scanner input1=new Scanner(System.in);
        int value1=input1.nextInt();

        int value2=input1.nextInt();

        int value3=input1.nextInt();
        if (value1>value2 && value1>value3) {
            System.out.println("The largest number is "+value1);
        }
        else if  (value2>value1 && value2>value3) {
            System.out.println("The largest number is "+value2);
        }
        else if  (value3>value1 && value3>value2) {
            System.out.println("The largest number is "+value3);
        }
    }
}
