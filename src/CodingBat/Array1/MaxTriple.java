package CodingBat.Array1;

public class MaxTriple {
    /*

Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
     */
    public static int maxTriple(int[] nums) {
        int max = 0;
        if (nums[0] > nums[nums.length - 1] && nums[0] > nums[nums.length / 2]) {
            max = nums[0];
        }
        if (nums[nums.length - 1] > nums[0] && nums[nums.length - 1] > nums[nums.length / 2]) {
            max = nums[nums.length - 1];

        }if (nums[nums.length/2] > nums[0] && nums[nums.length /2] > nums[nums.length-1]) {
            max = nums[nums.length/2];
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={5,2,3};
        System.out.println(maxTriple(a));

    }

}
