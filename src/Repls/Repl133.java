package Repls;

public class Repl133 {
    static int countA(String a) {
        int sum=0;
      for(int i=0 ; i<a.length(); i++) {
         char c= a.charAt(i);
         if(c=='a' || c=='A') {
             sum++;
         }
      }

        return sum;
    }
    {

    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
