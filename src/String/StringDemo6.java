package String;

public class StringDemo6 {
    public static void main(String[] args) {
     String str= "I love Java programming";
        System.out.print(str.charAt(6));  //to print and store any specific character str.charAt()
     for(int i=0; i<str.length(); i++) {
         if (!(str.charAt(i)==' ')) {             //to ignore spaces
             System.out.print(str.charAt(i));
         }
     }  }
}
