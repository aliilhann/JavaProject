package CodingBat.Array1;

import java.util.Arrays;

public class makeLast {
    /*
    Given an int array, return a new array with double the length where its last element is the same as the original array,
     and all the other elements are 0. The original array will be length 1 or more. Note: by default,
     a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
     */
    public static int[] makeLast(int[] nums) {
        /*
        int a[] = new int[nums.length*2];
        int last=nums[nums.length-1];
        for(int i=0; i<a.length-1; i++) {
            a[i]=0;
        }
        a[a.length-1]=last;

        return a;

         */
        // Make a new result array with double the length
        int[] res = new int[nums.length * 2];

        // Copy over the last element
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public static void main(String[] args) {
        int a[]=new int[5];
       // System.out.println(Arrays.toString(makeLast(a)));
        System.out.println(Arrays.toString(a));
    }
}

