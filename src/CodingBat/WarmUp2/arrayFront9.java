package CodingBat.WarmUp2;

public class arrayFront9 {
    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     The array length may be less than 4.

arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public boolean arrayFront9(int[] nums) {
      if(nums.length<4) {
          for(int i=0; i<nums.length; i++) {
              if(nums[i]==9) {
                  return true;
              }
          }
      }
      else{
          for(int i=0; i<nums.length; i++) {
              if(nums[0]==9 || nums[1]==9 || nums[2]==9 || nums[3]==9) {
                  return true;
              }
          }
      }
        return false;
    }

    public static void main(String[] args) {
        arrayFront9 arrayFront=new arrayFront9();
       // arrayFront.arrayFront9()
    }
}
/*
    int length=nums.length;
        if(length>4) {
                length=4;
                }
                for(int i=0; i<length ;i++) {
        if(nums[i]==9) {
        return true;
        }
        }
        return false;

 */