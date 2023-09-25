package PracticeJAVA;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    public static void writeToExcelSheet(){
        String[] rowHeading = {"First Name","Last Name","Address","Email"};
        List<User> users = createUserData();

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet = workbook.createSheet("User Details");
            Row headerRow = spreadsheet.createRow(0);

            //Creating header
        for(int i = 0; i < rowHeading.length; i++){
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(rowHeading[i]);
        }
        //Creating data rows for each user
        for(int i = 0; i < users.size(); i++){
            Row dataRow = spreadsheet.createRow(i + 1);
            dataRow.createCell(0).setCellValue(users.get(i).getFirstName());
            dataRow.createCell(1).setCellValue(users.get(i).getLastname());
            dataRow.createCell(2).setCellValue(users.get(i).getAddress());
            dataRow.createCell(3).setCellValue(users.get(i).getEmail());
        }
        //write the workbook in file system
        FileOutputStream out;
        try{
            out = new FileOutputStream(new File("/Users/brianurias/Desktop/TestData.xlsx"));

            workbook.write(out);
            out.close();
        }catch (FileSystemNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        
    }

    private static List<User> createUserData() {
        List<User> users= new ArrayList<>();
        users.add(new User("Brian","Urias","USA","bsu123@gmail.com"));
        users.add(new User("Graham","Oppy","Australia","oppy123@gmail.com"));
        return users;
    }

}
