package CodingBat.Logic2;

public class EvenlySpaced {
    /*
    Given three ints, a b c, one of them is small, one is medium and one is large.
     Return true if the three values are evenly spaced, so the difference between small and medium is the same
     as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
     */
    public boolean evenlySpaced(int a, int b, int c) {
      int dif1;
      int dif2;
      int dif3;
      if(a==b && a==c) {
          return true;
      }
      if(a==b) {
          return false;
        }
      dif1=Math.abs(a-b);
      dif2=Math.abs(a-c);
      dif3=Math.abs(b-c);
      if(dif1==dif2){
          return true;
      }
      if(dif1==dif3) {
          return true;
      }
      if(dif2==dif3) {
          return true;
      }
      return false;
    }


}
