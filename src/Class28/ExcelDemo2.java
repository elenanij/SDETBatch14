package Class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo2 {

    public static void main(String[] args) throws IOException {
         String path = "C:\\Users\\elena\\IdeaProjects\\JavaBatch14\\Data\\Book1.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook excelFile = new XSSFWorkbook(fileInputStream);

        Sheet sheet = excelFile.getSheet("Sheet1");

        int numofRows = sheet.getPhysicalNumberOfRows();

        System.out.println("numofRows = " + numofRows);

        for(int i =0; i<numofRows; i++) {

            Row row = sheet.getRow(i);

            int numOfCells = row.getPhysicalNumberOfCells();

            for(int j =0; j<numOfCells; j++) {

                Cell cell = row.getCell(j);
                System.out.print(cell + " ");
            }

            System.out.println();
        }


    }
}
