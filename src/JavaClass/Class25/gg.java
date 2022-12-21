package JavaClass.Class25;

import java.util.ArrayList;

public class gg {
    public static void main(String[] args) {
        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("lotion");
        cosmetics.clear();
        cosmetics.removeAll(cosmetics);
        System.out.println(cosmetics);
        cosmetics.clear();
        System.out.println(cosmetics);
    }
}
