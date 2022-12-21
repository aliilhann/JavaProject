package JavaClass.class24;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>(5);
        names.add("aLi");
        names.add("LeyLa");
        names.add("meLinda");
        names.add("aLex");
        names.add("miLey");




        if(names.isEmpty()) {
            System.out.println("ArrayList is empty");

        }else {
            System.out.println("ArrayList is not empty");
        }
        String name="aLi";
       if(names.contains(name)) {
           System.out.println("ArrayList contains the name "+ name);
       }else {
           System.out.println("ArrayList does not contain the name "+ name);
       }
        System.out.println("ArrayList size is "+ names.size());
        System.out.println(names);
        System.out.println(names.isEmpty());
        System.out.println(names.contains("aLi"));
    }
}
