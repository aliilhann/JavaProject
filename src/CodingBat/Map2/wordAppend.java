package CodingBat.Map2;

import java.util.HashMap;
import java.util.Map;

public class wordAppend {
    /*

Loop over the given array of strings to build a result string like this:
when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
 Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
     */
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String str = "";
        for (int i = 0; i < strings.length ; i++) {
            String s=strings[i];
            if(!map.containsKey(s)) {
                map.put(s,1);
            }else {
                Integer sum=map.get(s);
                map.put(s,sum++);
                str+=s;
            }

        }
        return str;
    }
    public static void main(String[] args) {
        String[] s={"a","a"};
        System.out.println(wordAppend(s));
    }

}
