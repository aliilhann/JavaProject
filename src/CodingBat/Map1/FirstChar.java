package CodingBat.Map1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FirstChar {
    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
     with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
     */
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String > map=new HashMap<>();

      for(String s:strings) {

          if(!map.containsKey(s.substring(0,1))) {
              map.put(s.substring(0,1),s);
          }else {
              String first=map.get(s.substring(0,1));
              map.put(s.substring(0,1),first+s);
          }
      }
        return map;
    }

    public static void main(String[] args) {
        String[] array={"ali","abc","ben","bed","cvf"};
        Map<String, String > map=new TreeMap<>();
        map.put("ali","veli");
        map.put("add","aaa");
        map.put("vbb","ccc");
        System.out.println(map.containsKey("a"));

       // System.out.println(map.get(map.keySet()));
        System.out.println(firstChar(array));
    }

}
