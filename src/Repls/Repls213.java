package Repls;

public class Repls213 {
    /*
   Create a method that will do temperature check.
   Anytime user passes temperature that is below 32 method should throw an Exception saying "It is freezing"

In Main method call the method and handle an Exception

**Expected Output:**

```
java.lang.RuntimeException: It is freezing
```
    */
    public static void main(String[] args) throws Exception {

      method(34);


    }
    public static void method(int degree) {
       try{
           if(degree<32) throw new RuntimeException(); {
               System.out.println("Degree is acceptable");
           }

       } catch (RuntimeException e){
           System.out.println("java.lang.RuntimeException: It is freezing");
       }


    }
}
