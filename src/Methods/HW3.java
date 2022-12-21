package Methods;

import java.util.Scanner;

public class HW3 {
    void word(String str) {
      StringBuilder str2=new StringBuilder(str);
      if(str.equalsIgnoreCase(str2.reverse().toString())) {
          System.out.println(str + " is a palindrome word");
      } else {
          System.out.println(str + " is not a palindrome word");
      }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word");
        String input=scanner.nextLine();
        HW3 reverse=new HW3();
        reverse.word(input);
    }
}
