package Repls;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Repls212 {
    /*
    Create a method that will not be handling exception and throwing it at caller.

In main method call method and handle the exception.

**Expected Output:**

```
java.io.FileNotFoundException:  (No such file or directory)
```
     */
    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("java.io.FileNotFoundException:  (No such file or directory)");
        }

    }
    public static void method() throws IOException {
       String path="Data/config.propertie";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("URL"));


    }
}
