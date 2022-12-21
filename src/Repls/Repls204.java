package Repls;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Repls204 {
    /*
    Create a Map that will preserve an order of entry objects

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values using iterator

**Expected output:**

```
Patrick ST
265
Vienna
22180
United State
     */
    public static void main(String[] args) {
        LinkedHashMap<String, String> map=new LinkedHashMap<>();
        map.put("Street","Patrick ST");
        map.put("Suite","265");
        map.put("City","Vienna");
        map.put("Zip","22180");
        map.put("Country","United States");

        var values=map.values();
        Iterator<String> iterator= values.iterator();
        while (iterator.hasNext()) {
            String value=iterator.next();
            System.out.println(value);
        }
    }
}
