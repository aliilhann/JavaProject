package JavaClass.Class25;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem= new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLiner");
        makeUpItem.add("Lipstick");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.addAll(cosmetics);
        beautyProducts.addAll(makeUpItem);
       // beautyProducts.removeAll(cosmetics);
        //beautyProducts.remove("Lotion");
        System.out.println(beautyProducts);
        beautyProducts.clear();
        System.out.println(beautyProducts);

        Iterator<String> iterator=makeUpItem.iterator();



    }

}
