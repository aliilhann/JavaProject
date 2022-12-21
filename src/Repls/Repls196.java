package Repls;

import java.util.HashSet;

public class Repls196 {
    /*
    Create a Set and and below values to it.

[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.

**Expected Output:**

```
[third, first, second]
[]
     */
    public static void main(String[] args) {
        HashSet<String> numbers=new HashSet<>();
        numbers.add("third");
        numbers.add("first");
        numbers.add("second");
        System.out.println(numbers);
        numbers.removeAll(numbers);
        System.out.println(numbers);
    }
}


