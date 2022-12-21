package JavaClass.class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add(0,"Josh");
        System.out.println(names);
    }
}
