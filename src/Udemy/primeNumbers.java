package Udemy;

public class primeNumbers {
    static boolean prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
        }
        }
        return true;
    }


    public static void main(String[] args) {
        for(int i=2 ; i<1000 ;i++) {
            if(prime(i)) {
                System.out.println( i +" is a prime number");
            }else {
                System.out.println(i + " is not a prime number");
            }
        }


    }
}