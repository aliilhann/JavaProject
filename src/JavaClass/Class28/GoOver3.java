package JavaClass.Class28;


import java.util.*;

public class GoOver3 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("IPhone 14",1000.0);
        items.put("Eggs",2.5);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",2.0);
        System.out.println(items);

        Set<Map.Entry<String,Double>> entrySet= items.entrySet();
        System.out.println(entrySet);

        for(Map.Entry<String,Double> entry:entrySet) {                    //getting all values and keys separately
            System.out.println(entry.getKey()+" "+entry.getValue());}
/*
            Iterator<Map.Entry<String,Double>> iterator=items.entrySet().iterator();

            while (iterator.hasNext()) {
              Map.Entry<String,Double> item=iterator.next();
              String keys=item.getKey();
              Double values=item.getValue();

              if(keys.contains("a")||  values>5 ) {
                 iterator.remove();
              }
            }
            System.out.println(items);

 */
        items.entrySet().removeIf(entry->entry.getKey().contains("a") || entry.getValue()>10);
        System.out.println(items);
        }
    }

