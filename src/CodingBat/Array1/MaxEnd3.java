package CodingBat.Array1;

import java.util.Arrays;

public class MaxEnd3 {
    /*
    Given an array of ints length 3, figure out which is larger,
    the first or last element in the array, and set all the other elements to be that value.
    Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public static int[] maxEnd3(int[] nums) {
        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[0];
            }
        }
        if (nums[0] < nums[nums.length - 1]) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = nums[nums.length - 1];
            }

        }

        return nums;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int max= Math.max(a[0],a[a.length-1]);
        a[0]=max;
        a[1]=max;
        int b[]={1,2,3,4};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(maxEnd3(b)));




    }
}