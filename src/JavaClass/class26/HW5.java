package JavaClass.class26;

import java.util.LinkedHashSet;

public class HW5 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Odessa");
        cities.add("IstanbuL");
        cities.add("Abudhabi");
        cities.add("BerLin");
        cities.add("Amsterdam");
        cities.add("Tokat");
        cities.add("Ankara");

        cities.removeIf(city->city.startsWith("A"));
        System.out.println(cities);

    }
}
