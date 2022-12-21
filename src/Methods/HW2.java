package Methods;

import java.util.Scanner;

public class HW2 {
    void evenOdd(int a) {
        if(a%2==0) {
            System.out.println(a + " is an even number");
        }else {
            System.out.println(a + " is an odd number");
        }
    }
    public static void main(String[] args) {
        HW2 num= new HW2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= scanner.nextInt();
        num.evenOdd(a);
    }

}
