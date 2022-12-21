package Repls;

import java.util.ArrayList;
import java.util.List;

public class Repls222 {
    /*
    Write the logic that picks largest and second largest numbers from a list add them and return the results.
 input to method is a list that contains the numbers
input [10,20,30,40]

     */
    public static int findMaxSum(List<Integer> list) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int num:list) {
            if(num>max) {
                secondMax=max;
                max=num;
            }else if (num > secondMax) {
               secondMax=num;
            }
        }
        int sum=max+secondMax;

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        System.out.println(findMaxSum(numbers));
    }
}
