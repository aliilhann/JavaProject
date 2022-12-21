package Repls;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Repls216 {
    /*
    Create an Array of size N whose elements sum to zero

ArraySumToZero(0) ->{}

ArraySumToZero(1) ->{0}

ArraySumToZero(2) ->{-1,1}

ArraySumToZero(3) ->{1,-1,0}

ArraySumToZero(4) ->{2,-2,3,-3}

N will be given as input to the function and fucntion will return
an array whose element will sum to zero.
     */
    public static void main(String[] args) {
      int[] a=arraySumToZero(4);
        System.out.println(Arrays.toString(a));


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        System.out.println(Arrays.toString(generate(scanner.nextInt())));


    }
    public static int[] arraySumToZero(int n) {
        int[] answer = new int[n];
        int index = 0;

        if (n % 2 == 1)
            answer[index++] = 0;

        n /= 2;

        for (int i = 1; i <= n; i++) {
            answer[index++] = i;
            answer[index++] = -i;
        }

        return answer;
    }
    public static int[] generate(int n){
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n-1; i++) {
            arr[i] = random.nextInt(Integer.MAX_VALUE)-random.nextInt(Integer.MAX_VALUE);
        }
        arr[n-1]= Arrays.stream(arr).sum()*-1;
        return arr;
    }
}
