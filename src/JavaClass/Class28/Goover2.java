package JavaClass.Class28;

import java.util.Collection;
import java.util.HashMap;

public class Goover2 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("IPhone 14",1000.0);
        items.put("Eggs",2.5);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",2.0);

        Collection<Double> values=items.values();  //printing all values by using a loop
        for(Double value:values) {
            System.out.println(value);
        }

        items.keySet().removeIf(key->key.contains("e")); //removing items with Lambda
        System.out.println(items);

        for(String key:items.keySet()) {  //removing items with for loop
            if(key.contains("E")) {
              items.remove(key);
            }
        }
        System.out.println(items);

    }
}
