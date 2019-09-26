package Practise;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadXcel {
    //Apache poi - library
    public static void main(String[] args) {
        try {
        File f = new File("C:\\Users\\Zadmin\\Desktop\\Divya_Data\\TestData");
            FileInputStream fis = new FileInputStream(f);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
               XSSFSheet sheet = wb.getSheetAt(0);
               sheet.getRow(0).getCell(0).getStringCellValue();
               int rowcount = sheet.getLastRowNum();
               for(int i=0;i<rowcount;i++){
                   sheet.getRow(i).getCell(0).getStringCellValue();
               }
               wb.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
