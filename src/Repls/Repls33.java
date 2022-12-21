package Repls;

import java.util.Scanner;

public class Repls33 {
    /*
    Ask the user to enter any number

if a user enters a number and it is even, print "Value is even", after that it should check if the number is greater than 1000
it should also print even number is large otherwise even value is just right.
if number is not even it should print number is odd after that it should check if odd number is greater than 1000
it should say odd value is large otherwise odd value is just right

**Example Output: for 33**
Please enter a number
Value is odd
Odd value is just right
**Example Output: for 1200**
Please enter a number
Value is even
Even value is large
     */
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int a=scanner.nextInt();
        if(a%2==0) {
            System.out.println("Value is even");
            if(a>1000) {
                System.out.println("Even value is large");
            }
            else{
                System.out.println("Even value is just right");
            }
        }
        else{
            if(a%2!=0) {
                System.out.println("Value is odd");
                if(a<1000) {
                    System.out.println("Odd value is just right");

                }
                else {System.out.println("Odd value is large");}

            }


        }
    }



}
