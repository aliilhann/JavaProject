package CodingBat.WarmUp1;

public class fg {
   String str(String s) {

       for(int i=0; i<s.length(); i+=3) {
           s= ""+(s.charAt(i));
       }return s;
   }

    public static void main(String[] args) {
        fg f=new fg();
        System.out.println( f.str("abcdefgh"));
    }
}
