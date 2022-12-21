package CodingBat.Array1;

import java.util.Arrays;

public class rotateLeft {
    public static int[] rotateLeft(int[] nums) {
        for(int j=0 ; j<3 ; j++) {
            int last = nums[nums.length - 1];
            for (int i = nums.length -1 ; i >0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = last;
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] d= {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateLeft(d)));
    }
}
