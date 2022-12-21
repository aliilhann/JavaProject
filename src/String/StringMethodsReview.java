package String;

public class StringMethodsReview {
    public static void main(String[] args) {

        String str="hello";
        str.toUpperCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        int size=str.length();
        char c= str.charAt(4);
        System.out.println(c);

        str.indexOf("h");
    }
}
