package String;

//import sun.security.rsa.RSAUtil;

public class StringDemo12 {
    public static void main(String[] args) {
        String str= "asbkfjhlihd23t8o593044u2yh@#$%";
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[^0-9a-z]",""));

        String str2= str.replaceAll("//3","");
        System.out.println(str2.length());
    }
}
