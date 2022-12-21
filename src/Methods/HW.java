package Methods;
import java.util.Scanner;
public class HW {
    void largest(int a, int b) {
        if(a>b) {
            System.out.println(a + " is larger than " + b);
        }else {
            System.out.println(b + " is larger than " + a);
        }
    }
    public static void main(String[] args) {
        HW num= new HW();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= scanner.nextInt();
        System.out.println("Enter the second number");
        int b= scanner.nextInt();
        num.largest(a,b);
    }
}
