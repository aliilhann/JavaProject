package CodingBat.Array1;

import java.util.Arrays;
import java.util.Collections;

public class Reverse3 {
    /*

Given an array of ints length 3, return a new array with the elements in reverse order,
 so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public static int[] reverse3(int[] nums) {
        Collections.reverse(Arrays.asList(nums));

        return nums;
    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        System.out.println(Arrays.toString(reverse3(a)));
        System.out.println(Arrays.toString(reverse3(a)));

        Integer [] arr = {10, 20, 30, 40, 50};
        reverse(arr);
    }
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}
