package Repls;

import java.util.ArrayList;
import java.util.List;

public class Repls219 {
    /*
    Count how many times a given word from a list is present as prefix in another list both lists
    will be given as input to the function

You have to implment a method that takes two lists as input one list contains the query words that
 we want to search from the other list.

Word List  ["steve","stevens","danny","steves","dan","john","johny"
        ,"joe"
        ,"alex"
        ,"alexander"]

Query Word List ["steve","alex","joe","john","dan"]

output

[2, 1, 0, 1, 1]

As word steve is present as prefix in word stevens and steves so
we get 2 for it note we are not counting if we have the exact word in the
original list

word alex is prefix in alexander so we get 1

word joe is not present as prefix so we get 0

     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
       list.add("steve");
       list.add("stevens");
       list.add("danney");
       list.add("stevens");
       list.add("dan");
       list.add("john");
       list.add("johnny");
       list.add("joe");
       list.add("alex");
       list.add("alexander");

       List<String> word=new ArrayList<>();
       word.add("steve");
       word.add("alex");
       word.add("joe");
       word.add("john");
       word.add("dan");

        System.out.println(countOnlyPrefixes(list,word));




    }

    public static List<Integer> countOnlyPrefixes(List<String> names, List<String> query) {
        List<Integer> numbers=new ArrayList<>(query.size());
        int sum=0;

        for(String name:names) {
            for(String ques:query) {
                if(name.contains(ques)) {

                }
            }
            numbers.add(sum);
        }


        return numbers;
    }

    }
