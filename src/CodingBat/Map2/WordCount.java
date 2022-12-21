package CodingBat.Map2;

import java.util.Map;
import java.util.TreeMap;

public class WordCount {
    /*
    The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different
    string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String,Integer> word=new TreeMap<>();
        for (String s : strings) {
            Integer sum=word.get(s);
            if(sum==null) {
                word.put(s,1);
            }else {
                word.put(s,sum+1);
            }
        }
        return word;
    }

    public static void main(String[] args) {
        String [] array={ "a","a","a","b","c","d","c","b"};
        System.out.println(wordCount(array));

        Integer integer=null;
        System.out.println(integer);

    }

}
