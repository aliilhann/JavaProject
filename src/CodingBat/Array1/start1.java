package CodingBat.Array1;

public class start1 {
    /*
    Start with 2 int arrays, a and b, of any length.
     Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
     */
    public int start1(int[] a, int[] b) {
        int sum=0;
        for(int i=0; i<a.length;i++) {
            if(a[i]==1) {
                sum++;
            }
        }
        for(int i=0; i<b.length;i++) {
            if(b[i]==1) {
                sum++;
            }
        }
        return sum;
    }

}
