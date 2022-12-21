package CodingBat.Map1;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapShare {
    /*

Modify and return the given map as follows: if the key "a" has a value,
set the key "b" to have that same value. In all cases remove the key "c",
 leaving the rest of the map unchanged.
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */
    public static Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b",map.get("a"));
            map.remove("c");
        }else {
            map.remove("c");
        }

        return map;
    }

    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("a","123");
        map.put("b","456");
        map.put("c","789");
        map.put("d","0");
        System.out.println(mapShare(map));
        System.out.println(map.get("a"));


    }

}
