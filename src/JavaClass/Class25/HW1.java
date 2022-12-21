package JavaClass.Class25;

import java.util.ArrayList;

public class HW1 {
    /* Create an arrayList of words.
      Remove every word that ends with “e”.
    */
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("horse");
        animals.add("cat");
        animals.add("dog");
        animals.add("giraffe");
        animals.add("eagLe");

       // Iterator<String> iterator=animals.iterator();
        var iterator=animals.iterator();

        while (iterator.hasNext()) {
           var item= iterator.next();
            if(item.endsWith("e")) {
               iterator.remove();
            }
        }


        System.out.println(animals);
    }

}

