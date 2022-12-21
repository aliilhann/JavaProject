package JavaClass.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

       Set<Map .Entry<String,Double>> entrySet= fruit.entrySet();

        Iterator<Map.Entry<String,Double>> iterator= entrySet.iterator();
        while (iterator.hasNext()) {
           var item= iterator.next();
            System.out.println(item.getKey()+item.getValue());
        }
        var values=fruit.values();
        Iterator<Double> iterator1=values.iterator();
        while (iterator1.hasNext()) {
            Double value=iterator1.next();
            System.out.print(value);
        }
    }
}
