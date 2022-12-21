package JavaClass.Class25;

import java.util.ArrayList;

public class HW2 {
    /*
        create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.

         */
    public static void main(String[] args) {
        ArrayList<String> drinks= new ArrayList<>();
        drinks.add("tea");
        drinks.add("coffee");
        drinks.add("topo chico");
        drinks.add("milk");
        drinks.add("lemonade");

      for(int i =0; i<drinks.size();i++) {
          if(drinks.get(i).contains("e")|| drinks.get(i).contains("a"))  {
              drinks.set(i,"water");
          }
      }
        System.out.println(drinks);
/*
      var iterator=drinks.iterator();
        while(iterator.hasNext()) {
            String drink= iterator.next();
            if(drink.contains("e") || drinks.contains("a")) {
                System.out.println("water");
            }else {
                System.out.println(drink);
            }
        }


 */

        }

    }

