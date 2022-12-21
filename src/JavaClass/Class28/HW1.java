package JavaClass.Class28;

import java.util.HashMap;

public class HW1 {
    /*
    /* Create a map of a building.
       Store floor number and its associated company name.
       (Example: 1= Google, 2=Syntax etc..).
       Insert 7 entries with duplicate keys and values.
       Check how many entries you have?
       Update company on a 4th floor.
       Remove company on the 7th floor.
       Print your map.
     */

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
        System.out.println("The original buildings floors : "+ map);

        map.replace(4,"Airbnb");
        map.remove(7);

        System.out.println("**********");
        System.out.println("Updated building floors : "+map);
    }
}

