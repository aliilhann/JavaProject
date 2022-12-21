package CodingBat.Array1;

import java.util.Arrays;

public class biggerTwo {
  /*
  Start with 2 int arrays, a and b, each length 2.
   Consider the sum of the values in each array.
    Return the array which has the largest sum. In event of a tie, return a.

biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
   */
  public int[] biggerTwo(int[] a, int[] b) {
      int c= Arrays.stream(a).sum();
      int d= Arrays.stream(b).sum();

      if(d>c) {
          return b;
      }
      return a;
  }
}
