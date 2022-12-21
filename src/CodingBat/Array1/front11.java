package CodingBat.Array1;

import java.util.Arrays;

public class front11 {
    /*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
     */
    public static int[] front11(int[] a, int[] b) {
        int array[]= new int[1];
     if(a.length==0&& b.length==0) {
         array=new int[] {};
     }else if(a.length>0 && b.length==0) {
         array=new int[] {a[0]};
     }
     else if(b.length>0 && a.length==0) {
         array=new int[] {b[0]};
     }else {
         array=new int[] {a[0],b[0]};
     }

        return array;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};

        System.out.println(Arrays.toString(front11(a,b)));
    }
}
