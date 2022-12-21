package Repls;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Repls199 {
    /*
    Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair

Print values 1 by 1 using loop and Iterator
```
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
     */
    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for(var name:names) {
            System.out.println(name);
        }

        Iterator<String> iterator= names.iterator();
        while(iterator.hasNext()) {
            String name= iterator.next();
            System.out.println(name);
        }

    }
}
