package JavaClass.Class28;

import java.util.LinkedHashSet;

public class HW6 {
    public static void main(String[] args) {
        LinkedHashSet<String> letters=new LinkedHashSet<>();
        letters.add("T");
        letters.add("U");
        letters.add("R");
        letters.add("K");
        letters.add("I");
        letters.add("Y");
        letters.add("E");


        String name="";
        for(String letter:letters) {
            name+=letter;
        }
        System.out.println(name);
    }

}

