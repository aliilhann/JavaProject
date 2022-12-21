package Udemy;

public class Methods2 {
    void selamlama(String name) {
        System.out.println("Selamlar "+ name);
    }
    void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Methods2 main=new Methods2();
        main.selamlama("ali");
        main.selamlama("riza");
       // Scanner scanner=new Scanner(System.in);
        //int num= scanner.nextInt();
        //int num1= scanner.nextInt();
        //int num2= scanner.nextInt();
        main.sum(5,6,7);
    }

    }

