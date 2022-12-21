package Repls;

import java.util.*;

public class Repls218 {
    /*
    Count the number of repetitions of words in an ArrayList append that count and return that list.
    You need to implement a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]
output [switch, tv, switch1, tv1, switch2, tv2]
In this example as word switch is repeated we pick the next entry where it is repeated and append the count i.e
how many times that word was present previously
More Examples

input ["switch","tv","switch","tv","switch","tv","radio"]

output [switch, tv, switch1, tv1, switch2, tv2, radio]

input ["switch","tv","switch","tv"]

output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]

output [switch, tv]
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("switch");
        list.add("tv");
        list.add("switch");
        list.add("tv");
        list.add("switch");
        System.out.println(countDeviceNames(list));

    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        /*
        List<String> list=new ArrayList<>();
        Map<String,Integer> map= new HashMap<>();
        int count=0;

        for(String device:deviceNames) {
            if(!map.containsKey(device)) {
                map.put(device,count);
                list.add(device);
            }else {
                map.put(device,map.get(device)+1);
                list.add(device+map.get(device));
            }
        }
        System.out.println(map);


        return list;

         */
        List<String>words=new LinkedList<>(deviceNames);

        for (int i = 0; i <words.size() ; i++) {
            int num=1;
            for (int j = i+1; j <words.size() ; j++) {
                if(words.get(i)==words.get(j)){
                    words.set(j, words.get(j) + num);
                    num++;
                }
            }
        }
        return words;
    }




}