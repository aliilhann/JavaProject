package JavaClass.class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HW3 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String> names=new HashSet<>(aList);
        System.out.println(names);
    }
}
