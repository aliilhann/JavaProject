package String;

public class StringDemo4 {
    public static void main(String[] args) {
        String str= "  I love Java  ";
        System.out.println(str.trim()); //remove the spaces before and after the String but not the ones between the words


        String str2= "Java";
        System.out.println(str2.toLowerCase().startsWith("j"));  //starts with method  //we can chain multiple methods
        System.out.println(str2.endsWith("k"));    //check if string ends with specific word
        System.out.println(str2.contains("easy")); //check if string contains specific word

        if(!str.contains(str2)) {
            System.out.println("that is true");
        }
    }
}
