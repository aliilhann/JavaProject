package CodingBat.Map1;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapBully {
    /*

Modify and return the given map as follows: if the key "a" has a value,
 set the key "b" to have that value, and set the key "a" to have the value "".
 Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */
    public static  Map<String, String> mapBully(Map<String, String> map) {
    if(map.containsKey("a")) {
        map.put("b",map.get("a"));
        map.put("a","");
    }

        return map;
    }

    public static void main(String[] args) {
        Map<String,String> map=new LinkedHashMap<>();
        map.put("a","123");
        map.put("b","456");
        map.put("c","789");
        map.put("d","0");

        System.out.println(mapBully(map));
    }

}
