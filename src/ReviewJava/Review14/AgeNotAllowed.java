package ReviewJava.Review14;

public class AgeNotAllowed extends RuntimeException{
    public AgeNotAllowed(String errorMessage) {
        super(errorMessage);
    }
}
