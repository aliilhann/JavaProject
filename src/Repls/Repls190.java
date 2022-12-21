package Repls;

import java.util.LinkedList;

public class Repls190 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        int num1=0;
        int num2=1;
        numbers.add(num1);
        numbers.add(num2);

        for(int i=0; i<8; i++) {
            numbers.add(num1);
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            //numbers.add(num3);
        }
        for(Integer num:numbers) {
            System.out.print(num+" ");
        }




    }
}
