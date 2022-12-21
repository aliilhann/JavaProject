package JavaClass.class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Data/test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);
        Sheet sheet=excelFile.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        List<LinkedHashMap<String,String>> list=new LinkedList<>();

        Row headerRow= sheet.getRow(0);

        for(int rowNo=1; rowNo<noOfRows;rowNo++) {
            LinkedHashMap<String, String> maps = new LinkedHashMap<>();
            Row row = sheet.getRow(rowNo);

            int noOfCells = row.getPhysicalNumberOfCells();
            for (int cellNo = 0; cellNo < noOfCells; cellNo++) {

                String keys = headerRow.getCell(cellNo).toString();
                String values = row.getCell(cellNo).toString();

                maps.put(keys,values);
            }list.add(maps);
        }
        System.out.println(list);
        }
    }

