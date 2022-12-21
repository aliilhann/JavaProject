package ReviewJava.Review14;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        int age=15;

        if(age<18) {
            throw new AgeNotAllowed("You are not allowed to be here");
        }
    }
}
