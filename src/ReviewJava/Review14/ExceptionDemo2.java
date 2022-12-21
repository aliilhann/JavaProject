package ReviewJava.Review14;

import Utils.ExcelReader;

import java.io.IOException;


public class ExceptionDemo2 {
    public static void main(String[] args) throws IOException {

        ExcelReader.read("abcdefg");

    }
}
