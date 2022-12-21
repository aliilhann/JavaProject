package JavaClass.Class28;

import java.util.LinkedList;
import java.util.List;

public class HW7 {
    public static void main(String[] args) {
        List<Integer> numbers=new LinkedList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(35);
        numbers.add(23);
        numbers.add(-5);

       int sum=0;
       for(int number:numbers) {
           sum+=number;
       }
        System.out.println("The sum of the given numbers are " +sum);
    }
}
