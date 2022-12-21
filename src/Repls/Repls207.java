package Repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repls207 {
/*
Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Using EntrySet print the key and values pairs using iterator only

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

Using EntrySet print the key and values pairs using iterator only

OUTPUT

HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL
 */
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        System.out.println("HashMap Before Replace :");

        Iterator<Map.Entry<String, String>> iterator=map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,String> entrySet= iterator.next();
            String keys=entrySet.getKey();
            String values=entrySet.getValue();
            System.out.println(keys+" : "+values);
        }
        map.replace("THREE","ASEL");
        map.replace("FIVE","SUMAIR");

        System.out.println("HashMap After Replace :");
        System.out.println("------------------");

        Iterator<Map.Entry<String, String>> iterator2=map.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String,String> entrySet2= iterator2.next();
            String keys2=entrySet2.getKey();
            String values2=entrySet2.getValue();
            System.out.println(keys2+" : "+values2);
        }

    }
}
