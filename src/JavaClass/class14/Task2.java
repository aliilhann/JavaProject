package JavaClass.class14;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str= "asddffRTYI123345^&*(";
        System.out.println("length is = " + str.replaceAll("[^a-zA-Z0-9]","").length());

    }
}
