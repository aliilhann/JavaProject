package JavaClass.class27;

import java.util.HashMap;

public class HW1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Google");
        map.put(2,"Syntax");
        map.put(3,"Amazon");
        map.put(4,"Ebay");
        map.put(2,"Google");
        map.put(7,"Ebay");
        map.put(5,"Uber");

        int size=map.size();
        System.out.println("The size of the building list is "+size);

        map.replace(4,"Airbnb");
        map.remove(7);

        System.out.println(map);
    }
}
