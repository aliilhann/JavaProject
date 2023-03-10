package JavaClass.Class28;

import java.util.HashMap;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone14",1000.0);
        items.put("Eggs",2.4);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flowers",1.0);

        items.values().removeIf(price -> price > 10);
        System.out.println(items);

        /*
        Iterator<Double> iterator= items.values().iterator();

        while (iterator.hasNext()) {
            Double price=iterator.next();
            if(price>10) {
                iterator.remove();
            }
        }
         */


    }
}
