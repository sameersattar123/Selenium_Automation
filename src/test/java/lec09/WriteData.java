package lec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\myFile.xlsx");
        
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet  = book.createSheet("Data");

        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0).setCellValue("ID");
        row1.createCell(1).setCellValue("Name");
        row1.createCell(2).setCellValue("Father Name");
        row1.createCell(3).setCellValue("Profession");
        row1.createCell(4).setCellValue("Roll Number");
        
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("1");
        row2.createCell(1).setCellValue("Sameer");
        row2.createCell(2).setCellValue("Abdul Sattar");
        row2.createCell(3).setCellValue("Teacher");
        row2.createCell(4).setCellValue("1111");
        
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("2");
        row3.createCell(1).setCellValue("Ali");
        row3.createCell(2).setCellValue("Muhammad fakhir");
        row3.createCell(3).setCellValue("Accountant");
        row3.createCell(4).setCellValue("2222");

        XSSFRow row4 = sheet.createRow(3);
        row4.createCell(0).setCellValue("3");
        row4.createCell(1).setCellValue("Daniyal");
        row4.createCell(2).setCellValue("Waleed Shaikh");
        row4.createCell(3).setCellValue("CSS Offcier");
        row4.createCell(4).setCellValue("3333");

        book.write(file);
        book.close();
        file.close();
        System.out.println("Data has been successfully written to the Excel file.");

        
    }
}
