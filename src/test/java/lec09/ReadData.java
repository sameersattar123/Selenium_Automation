package lec09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//  Excel ==> WorkBook ==> Sheets ===> Rows ===> Cells

public class ReadData {
        public static void main(String[] args) throws IOException {
                FileInputStream file = new FileInputStream(
                                System.getProperty("user.dir") + "\\TestData\\OpenCart.xlsx");

                XSSFWorkbook wookBook = new XSSFWorkbook(file);

                XSSFSheet sheet = wookBook.getSheetAt(0);

                int totalRows = sheet.getLastRowNum();
                int totalCols = sheet.getRow(1).getLastCellNum();

                System.out.println(totalRows); // 39
                System.out.println(totalCols); // 3

                for (int i = 0; i <= totalRows; i++) {
                        XSSFRow currentRow = sheet.getRow(i);
                        for (int j = 0; j < totalCols; j++) {
                                XSSFCell XSSFCell = currentRow.getCell(j);
                                System.out.print(XSSFCell.toString() + "\t");
                        }
                        System.out.println();
                }
                wookBook.close();
                file.close();

        }
}