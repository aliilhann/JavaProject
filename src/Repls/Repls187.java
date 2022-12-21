package Repls;

import java.util.ArrayList;
import java.util.Iterator;

public class Repls187 {
    /*
    Create an array list to type String.

Add these values below to your arraylist

hi

yo

sup

yolo

boop

Remove 1, 3, 5 element from an array

print remained values one by one in one line

Expected Output:

yo yolo
     */
}
class Main187 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hi");
        names.add("yo");
        names.add("sup");
        names.add("yolo");
        names.add("boop");
        ArrayList<String> namestobeRemoved=new ArrayList<>();
        namestobeRemoved.add("hi");
        namestobeRemoved.add("sup");
        namestobeRemoved.add("boop");
        names.removeAll(namestobeRemoved);
        Iterator<String> iterator= names.iterator();

        for(String name:names) {
            System.out.println(name);
        }
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");
        for(int i = 0; i < words.size(); i++){
            words.remove(i);

        }






        }



    }

