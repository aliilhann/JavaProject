package CodingBat.WarmUp1;

public class FistlastChar {


    public static void main(String[] args) {
        String a= "hello";
       String b= ""+a.charAt(0);
       String c=""+a.charAt(a.length()-1);
       String d=a.substring(1,a.length()-1);
        a=c+d+b;
        System.out.println(a);
    }
}
