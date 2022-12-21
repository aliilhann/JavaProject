package Repls;

import java.util.ArrayList;
import java.util.Iterator;

public class Repls191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        ArrayList<Boolean> listB=new ArrayList<>();
        listB.addAll(listA);

        Iterator<Boolean> iterator= listB.iterator();
        while(iterator.hasNext()) {
            Boolean print=iterator.next();
            System.out.println(print);

        }




    }
}

