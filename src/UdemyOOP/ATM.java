package UdemyOOP;

import java.util.Scanner;

public class ATM {

    public void run(Hesap hesap) {
     Login login=new Login();
     Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the bank");
        System.out.println("**********");

    }
}
class Main {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("Ali iLhan","1234",2000);
       atm.run(hesap);
        System.out.println("Exiting the system");

    }
}
