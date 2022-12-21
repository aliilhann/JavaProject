package CodingBat.Array1;

import java.util.Arrays;

public class SameFirstLast {
    /*

Given an array of ints, return true if the array is length 1 or more,
 and the first element and the last element are equal.

sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
     */
    public static boolean sameFirstLast(int[] nums) {

            return (nums.length>=1 && nums[0]==nums[nums.length-1]);



    }

    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,1};
        System.out.println(sameFirstLast(a));

        int [] b={1,2,3,4,5};
        int []c;
        for(int i=b.length-1; i>=0; i--) {

            System.out.print(b[i]+" ");
        }
        System.out.println();
      // for(int j=0 ; j<3 ; j++) {
            int last = b[b.length - 1];
            for (int i = b.length -1 ; i >0; i--) {
                b[i] = b[i-1];
            }
            b[0] = last;
            c=b;
    //  }
        System.out.println(Arrays.toString(c));

    }


}
