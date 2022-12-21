package JavaClass.Class28;

import java.util.Collection;
import java.util.HashMap;

public class MapDemp3 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone14", 1000.0);
        items.put("Eggs", 2.4);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flowers", 1.0);

        Collection<String> keys = items.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("******************");
       var  values = items.values();

        for (Double value : values) {
            System.out.println(value);
        }
    }
}
