package Repls;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repls217 {
    /*
    Complete countDuplicates method This method should count how many numbers are appearing more than once
     and should return the count.

Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
     */
    public static void main(String[] args) {
      List<Integer> numbers=new ArrayList<>();
       numbers.add(1);
       numbers.add(12);
       numbers.add(12);
       numbers.add(13);
       numbers.add(45);
       numbers.add(45);


        System.out.println(countDuplicates(numbers));

    }
    static int countDuplicates(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
       Set<Integer> duplicate = new HashSet<>();

        for (Integer num : numbers) {
            if (!set.add(num)) {
                duplicate.add(num);
            }
        }
        System.out.println(set);
        System.out.println(duplicate);
        int count = duplicate.size();
        return count;

    }

}