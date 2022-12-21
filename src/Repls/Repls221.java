package Repls;

import java.util.Scanner;

public class Repls221 {
    /*
    Find the largest even length word from a String if there are two words with same largest
    even length return the first one. if there are not even words return -1

input ["find MaxLen Even"]

output ["MaxLen"]

input["I am very Good at Java"]

output ["very"]

input["I was"]

output ["-1"]
     */
    public static String findMaxLenEven(String str) {
        String[] array=str.split(" ");
        String str2="-1";
        for(int i=0; i<array.length;i++) {
            if(str2.length()<array[i].length() && array[i].length()%2==0) {
                str2=array[i];
            }
        }
        return str2;

    }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence");

        System.out.println(findMaxLenEven(scanner.nextLine()));
    }
}
