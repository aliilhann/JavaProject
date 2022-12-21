package JavaClass.Class28;

import java.util.Iterator;
import java.util.TreeMap;

public class HW2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Turkiye", "Ankara");
        countries.put("Mexico", "Mexico City");
        countries.put("SwitzerLand", "Bern");
        countries.put("USA", "Washington DC");
        countries.put("Germany", "BerLin");
        countries.put("Canada", "Toronto");

        System.out.println("All keys by using for loop:");
        var keys = countries.keySet();
        for (var key : keys) {
            System.out.print(key + ", ");
        }
        System.out.println();
        System.out.println("************************");
        System.out.println("All keys by using Iterator:");
        var keys2 = countries.keySet();
        Iterator<String> iterator = keys2.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + " ");
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println("All values by using for loop:");
        var values = countries.values();
        for (var value : values) {
            System.out.print(value + ", ");
        }
        System.out.println();
        System.out.println("************************");
        System.out.println("All values by using Iterator:");

        var country=countries.values();
        Iterator<String> iterator2= country.iterator();
        while (iterator2.hasNext()) {
            String value=iterator2.next();
            System.out.print(value+", ");
        }
        System.out.println();
        System.out.println("*************");

        System.out.println("All keys and values together by using for loop:");
        var entrySet = countries.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry);
        }


    }
    }

