package JavaClass.class26;

import java.util.ArrayList;
import java.util.HashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        HashSet<Integer> num=new HashSet<>();

        num.add(20);
        num.add(10);
        num.add(10);


        System.out.println(num);
    }
}
