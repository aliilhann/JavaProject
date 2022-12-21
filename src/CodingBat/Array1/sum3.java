package CodingBat.Array1;

import java.util.Arrays;

public class sum3 {
    /*
    Given an array of ints length 3, return the sum of all the elements.

sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
     */
    public static int sum3(int[] nums) {
        int sum=0;
        for(int num:nums) {
         sum+=num;

        }
        System.out.println(sum);
        return Arrays.stream(nums).sum();


    }

    public static void main(String[] args) {
    int a[]={1,3};
        System.out.println(sum3(a));
    }

}
