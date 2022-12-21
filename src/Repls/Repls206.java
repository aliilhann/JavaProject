package Repls;

import java.util.HashMap;
import java.util.Map;

public class Repls206 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");


        for(Map.Entry<String,String> items :map.entrySet()){
           String key= items.getKey();
           String value=items.getValue();
            System.out.println(key+" : "+ value);

        }
        map.remove("ONE");
        map.remove("FOUR");
        System.out.println("HashMap After Remove :");
        System.out.println("------------------");



        for(Map.Entry<String,String> items :map.entrySet()){
            String key= items.getKey();
            String value=items.getValue();
            System.out.println(key+" : "+ value);

        }


    }
}
