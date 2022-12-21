package JavaClass.Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem= new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("Lipstick");
        makeUpItem.add("Dove Soap");
        makeUpItem.add("Conditioner");
        makeUpItem.add("EyeLiner");
        makeUpItem.add("Shampoo");
        makeUpItem.add("Lotion");



       Iterator<String> iterator= makeUpItem.iterator();
     /*   System.out.println(iterator.hasNext()); //we have one item
        System.out.println(iterator.next());  //it gives us the item and also removes the items from iteration
        System.out.println(iterator.hasNext());
      */
        while(iterator.hasNext()) {
            System.out.println(iterator.next());

        }



    }
}
