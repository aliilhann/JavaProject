package Methods;

import java.util.Scanner;

public class HW5 {
    String email(String a, String b, String c) {

        return "a" ;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter three words");
        String input1= scanner.nextLine();
        String input2= scanner.nextLine();
        String input3= scanner.nextLine();
        HW5 words=new HW5();
        words.email(input1,input2,input3);
        System.out.println("The email address is " + input1.toLowerCase()+ input2.toLowerCase()+"@"+input3.toLowerCase()+".com");
    }
}
