package Methods;

import java.util.Scanner;

public class HW4 {
    void hello(String str) {
        if ("Turkiye".equals(str)) {
            System.out.println("Merhaba");
        } else if ("Mexico".equals(str)) {
            System.out.println("Hola");
        } else if ("France".equals(str)) {
            System.out.println("Bonjour");
        } else if ("Italy".equals(str)) {
            System.out.println("Ciao");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose a country");
        String country= scanner.nextLine();
        HW4 language=new HW4();
        language.hello(country);
    }

}
