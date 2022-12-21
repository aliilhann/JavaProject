package Repls;

import java.util.HashMap;
import java.util.Map;

public class Repls208 {
    /*
    Create a Method in Main class using below specification.

Method Name: display.

Return Type: Void

Parameters : Map<String,Integer>

Logic:

First the method will check the given map is empty or not.

If the map is not empty print pairs of key and value using loops

If map is empty simply print "map is empty"

**NOW IN MAIN METHOD**

Create HashMap of String keys and Integer values

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

call above method with these arguments.

then clear the map.

and call above method again.

     */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        display(map);
        map.clear();
        display(map);
    }

    public static void display(Map<String, Integer> map) {


        if (map.isEmpty()) {
            System.out.println("map is empty");
            return;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


    }
}
