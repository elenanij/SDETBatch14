package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
         String path = "C:\\Users\\elena\\IdeaProjects\\JavaBatch14\\Data\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path); //navigate to path (link from path to java program)

        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);

        Sheet sheet = excelFile.getSheet("Sheet1");

        Row row = sheet.getRow(0);

        System.out.println(row.getCell(0));

        Row row1 = sheet.getRow(1);

        System.out.println(row1.getCell(0));

        System.out.println(sheet.getPhysicalNumberOfRows());


    }
}
