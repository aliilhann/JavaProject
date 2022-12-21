package Udemy;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> places=new LinkedList<>();
        places.add("Turkey");
        places.add("Germany");
        places.add("Switzerland");
        places.add("USA");
        places.add("Mexico");

        for(String place:places) {
            System.out.println(place);
        }
    }


}
