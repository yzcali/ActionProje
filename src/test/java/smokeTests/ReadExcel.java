package smokeTests;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import utilities.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExcel extends Testbase {

   @Test

    public void   ReadExcel() throws IOException {
      //I have placed an excel file 'Test.xlsx' in my D Driver

        FileInputStream fis = new FileInputStream("D:\\Tasks and Instructions.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.

        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println(cell);  //"Meetings"

       System.out.println(sheet.getRow(11).getCell(1)); // "12 / 09 / 2020 Wednesday"



    }
    @Test
    public void WriteExcel() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Tasks and Instructions.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook(fis);

        XSSFSheet sheet = workbook.getSheetAt(0);

        Row row = sheet.createRow(10);
        Cell cell = row.createCell(10);
        //Now we need to find out the type of the value we want to enter.
        //If it is a string, we need to set the cell type as string
        //if it is numeric, we need to set the cell type as number


        cell.setCellValue("Next_ generation");

        FileOutputStream fos = new FileOutputStream("D:\\Tasks and Instructions.xlsx");
        workbook.write(fos);
        fos.close();
        System.out.println("End of writing data in excel"); // End of writing data in excel





    }
}
