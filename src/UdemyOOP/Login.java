package UdemyOOP;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your user name");
        String name=scanner.nextLine();
        System.out.println("Enter your password");
        String password=scanner.nextLine();

        if(name.equals(hesap.getName()) && password.equals(hesap.getPassword())) {
            return true;
        } else {
            System.out.println("Your user name or password is wrong");
            return false;
        }


    }
}
