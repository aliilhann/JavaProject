package JavaClass.class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        int a=25;
        for(int i=0; i<numbers.size();i++) {
            System.out.println(numbers.get(i));
        }
        for(int num:numbers) {
            System.out.println(num);
        }
        System.out.println(numbers);
    }

}
