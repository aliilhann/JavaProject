package JavaClass.Class28;

import java.util.HashMap;
import java.util.Iterator;

public class GoOver {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("IPhone 14",1000.0);
        items.put("Eggs",2.5);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",2.0);

        System.out.println(items);



       //removing the item if the price is more than $10
        Iterator<Double> values=items.values().iterator();

        while (values.hasNext()) {
            Double value=values.next();
            if(value>10) {
                values.remove();
            }
        }
        System.out.println(items);

        items.keySet().removeIf(keys->keys.contains("e")); //removing the items which contains letter e
        System.out.println(items);


    }
    public static boolean check(Double price) {
        if(price>10) {
            return true;
        }else {
            return false;
        }
    }
}
