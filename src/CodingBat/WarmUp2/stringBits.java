package CodingBat.WarmUp2;

public class stringBits {
    /*
    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"

     */
    public static String stringBits(String str) {
        String str2="";
        for(int i=0; i<str.length(); i+=2) {
            str2=str2+str.charAt(i);
        }

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(stringBits("hello"));
    }
}
