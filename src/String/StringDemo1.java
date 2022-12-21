package String;

public class StringDemo1 {
    public static void main(String[] args) {
        String str= new String("ali  "); //proper way of creating an object
        String str2="ali";  //only work for String and Wrapper classes
        System.out.println(str.length());

        if(str.length()<8) {
            System.out.println("Name should be");
        }
    }
}
