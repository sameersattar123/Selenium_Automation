package lec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicData {
    public static void main(String[] args)  throws FileNotFoundException , IOException {
         FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myFileDynamic.xlsx");
        
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet  = book.createSheet("Data");

        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows");
        int noOfRows = sc.nextInt();
        System.out.println("How many columns");
        int noOfCols = sc.nextInt();

        for (int i = 0; i <= noOfRows; i++) {
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < noOfCols; j++) { 
                row.createCell(j).setCellValue(sc.next()); 
            }
        }

        book.write(file);
        book.close();
        file.close();
        System.out.println("Data has been successfully written to the Excel file.");   
    }
}
