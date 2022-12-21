package JavaClass.Class25;

import java.util.ArrayList;

public class ContainsAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem= new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLiner");
        makeUpItem.add("Lipstick");
        makeUpItem.add("Dove Soap");
        makeUpItem.add("Conditioner");
        makeUpItem.add("Shampoo");
        makeUpItem.add("Lotion");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        System.out.println(makeUpItem.containsAll(cosmetics));

        cosmetics.add("Soap");

        System.out.println(makeUpItem.containsAll(cosmetics));


    }
}
