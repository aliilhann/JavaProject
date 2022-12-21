package JavaClass.Class28;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone14", 1000.0);
        items.put("Eggs", 2.4);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flowers", 1.0);

        System.out.println(items);

        var entrySet=items.entrySet();

        for(var entry:entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        items.entrySet().removeIf(entry->entry.getKey().contains("e")&&entry.getValue()>10);
        System.out.println(items);

    }
}
