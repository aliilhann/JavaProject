package Variable;

public class HW3 {
    private String vowel(String s) {
       String str=s.replaceAll("[^aeiou]","");
        return str;
    }

    public static void main(String[] args) {
        HW3 main=new HW3();
        System.out.println(main.vowel("Friends"));
    }
}
