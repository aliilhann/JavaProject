package Udemy;

import java.util.Scanner;

public class Methods1 {
    void selamlama() {
         System.out.println("Merhaba nasilsiniz");
         System.out.println("Selamlar.........");
     }

     void functions() {
        Scanner scanner=new Scanner(System.in);

         int num= scanner.nextInt();
        for(int i=num-1; i>0; i--) {
            num=num*i;
        }
         System.out.println(num);
     }


    public static void main(String[] args) {
        Methods1 main=new Methods1();
        main.selamlama();
        main.selamlama();
        main.functions();

    }
}
