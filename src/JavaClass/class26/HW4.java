package JavaClass.class26;

import java.util.TreeSet;

public class HW4 {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Turkey");
        countries.add("Mexico");
        countries.add("USA");
        countries.add("Switzerland");
        countries.add("France");
        countries.add("Canada");
        System.out.println(countries);

        System.out.println("**************");

        for(var country:countries ) {
            System.out.print(country+" ");
        }

    }
}
