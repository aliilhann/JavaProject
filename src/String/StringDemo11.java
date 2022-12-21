package String;

public class StringDemo11 {
    public static void main(String[] args) {
        String str="Thor love and thunder";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='t') {
                System.out.println(i);
            }
        }
    }
}
