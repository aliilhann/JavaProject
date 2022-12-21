package Methods;

import java.util.Scanner;

public class HW6 {
    String number(int a) {
        for(int i=2; i<a; i++) {
            if(a%i==0) {
              // System.out.println(a +" is not a prime number.");
                return (a +" is not a prime number.");
            }else {
                return ("is a prime");
            }
        }return ("is a prime");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        HW6 prime=new HW6();
        System.out.println(prime.number(num));
    }
}
