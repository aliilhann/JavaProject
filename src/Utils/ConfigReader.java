package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read(String path) {

        Properties properties=null;
        FileInputStream fileInputStream=null;
        try {
            fileInputStream = new FileInputStream(path);
             properties = new Properties();
            properties.load(fileInputStream);

        }catch (FileNotFoundException e) {
            System.out.println("Please check your file path");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("");
            e.printStackTrace();
        }
        finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;

    }
}
