package JavaClass.class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemp4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

       Collection<String> allKeys=fruit.keySet(); // getting all the  keys in the form of a set
        System.out.println(allKeys);
        Iterator<String> iterator= allKeys.iterator(); // Getting an iterator on that  set
        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruit);
        fruit.keySet().removeIf(x-> x.contains("A"));
        System.out.println(fruit);

    }
}
