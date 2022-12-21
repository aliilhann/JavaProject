package JavaClass.class29;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ReadingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {
       List<Map<String, String>> excelData= ExcelReader.read("Data/test.xlsx");
        System.out.println(excelData);

    }

}
