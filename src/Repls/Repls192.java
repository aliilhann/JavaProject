package Repls;

import java.util.LinkedList;

public class Repls192 {
    public static void main(String[] args) {
        LinkedList<Integer> primeNumbers=new LinkedList<>();

        for(int a=2 ; a<=100 ;a++) {
            if(prime(a)) {
                primeNumbers.add(a);
            }
        }
        System.out.println(primeNumbers);
    }
    public  static boolean prime(int num) {
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}