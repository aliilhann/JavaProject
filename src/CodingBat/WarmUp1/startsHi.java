package CodingBat.WarmUp1;

public class startsHi {
    /*
    Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
     */
    static boolean startsHi(String str) {
        if(str.startsWith("hi")) {
            return true;
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(startsHi("hello"));
    }
}
