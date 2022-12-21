package Variable;

public class HW1 {
    int numbers(int[] array) {
     int sum=0;
       for(int i=0; i<array.length; i++) {
           sum+=array[i];
       }

       return sum;
   }

    public static void main(String[] args) {
        HW1 main=new HW1();
        System.out.println("The sum of the array numbers is " + main.numbers(new int[]{1,2,3,4}));
    }
}
