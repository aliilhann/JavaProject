package Repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repls203 {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();

        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
/*
        map.forEach((key,value)-> {
                    System.out.println(key);
        });

map.entrySet().stream().forEach((entry)->{

        });


 */

        var maps=map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator=maps.iterator();
        while (iterator.hasNext()) {
            var itr=iterator.next();
            String keys= itr.getKey();
            int values= itr.getValue();

            System.out.println("Key = "+ keys+ " and value "+values);
        }


    }
}
