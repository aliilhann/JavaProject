package CodingBat.Array1;

public class RotateLeft3 {
    /*

Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    /*
       for (int j = 0; j < 2; j++) {
            int last = nums[nums.length - 1];


            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;

        } return nums;
     */
    public static int[] rotateLeft3(int[] nums) {
        int temp[] = nums;
        for(int i=nums.length-1; i>=0; i--) {
            System.out.print(nums[i]);
        }
        System.out.println(temp[0]);

        return temp;
    }

    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        //n determine the number of times an array should be rotated.
        int n = 3;

        //Displays original array
        System.out.println("Original array: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("********");
        int [] array = new int [] {1, 2, 3, 4, 5};
        int last=array[array.length-1];
        arr[0]=last;
        for(int i=array.length-1; i>0; i--) {
            array[i]=array[i-1];

            System.out.println(array[i]+" ");
        }
        int b[]= {1,2,3,4};
        System.out.println(rotateLeft(b));
    }
    public static int[] rotateLeft(int[] nums) {
        int a[]={};
        for(int i=nums.length-1; i>=0 ; i--) {
          a=nums;
        }

        return a;
    }

}
