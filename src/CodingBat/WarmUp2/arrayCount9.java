package CodingBat.WarmUp2;

public class arrayCount9 {
    /*
    Given an array of ints, return the number of 9's in the array.
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public static int arrayCount9(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length;i++) {
            if(nums[i]==9) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
     // arrayCount9(int[] a= {5,7,8});
    }
}
