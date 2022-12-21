package ReviewJava.Review13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone14", 1000.0);
        items.put("Eggs", 2.4);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flowers", 1.0);
    }
    public static Set<String> getKeys(Map<String,Double> map) {
        return map.keySet();
    }
}
