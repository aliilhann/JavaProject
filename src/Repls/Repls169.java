package Repls;

public class Repls169 {
    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
    static final double avgElements(int[]a) {
        double sum=0;

        for(double array:a) {
           sum+=array;

        }
        return  sum/a.length;
    }
}


