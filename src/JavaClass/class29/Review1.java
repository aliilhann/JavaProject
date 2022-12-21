package JavaClass.class29;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Review1 {
    /*
        we want to read the data from the files
         */
    public static void main(String[] args) throws IOException {
        String path="Data/book..xlsx";

     List<Map<String, String>> data= ExcelReader.read(path);

        System.out.println(data.get(0).get("name"));

        for(Map<String,String> row:data) {
            System.out.println(row);
        }
        System.out.println(data);





    }
}
