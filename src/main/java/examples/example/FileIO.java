package examples.example;
// Java IO --> Input Out for file
// java uses the concept of stream to make IO operation faster
// Java IO package contains all the required input and output operations
// Java IO package contains all the required inout and output operations
// File handling in java by IO API

//Stream -->
// A stream is a sequence of data in java which is composed of bytes
//System.out -- standard output stream
//System.in -- standard input stream

// OutputStream:
//Java explanation of output stream and inputStream:
//OutputStream:
//Java uses an output stream to write data to a destination. It may be a file, an array.
//InputStream:
//Java application uses an inputStream to read data from source, it may be a file, an array.




import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        //WriteToFile();
        //ReadFile();
        ExcelWrite();
        ReadExcel();
    }

    public static void WriteToFile() throws IOException{
        String content = "This is the content to write to the file";
        try{
            String filePath = "/Users/brianurias/Desktop/text.txt";

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

            writer.write(content);

            writer.close();

            System.out.println("the content has been written to the file");
        }catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }
    }

    public static void ReadExcel(){
        try (Workbook workbook =
                new XSSFWorkbook(new FileInputStream("/Users/brianurias/Desktop/example.xlsx"))) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                StringBuilder rowData = new StringBuilder();
                for (Cell cell : row) {
                    String cellValue = cell.getStringCellValue();
                    rowData.append(cellValue).append(" | ");
                }
                System.out.println(rowData.substring(0, rowData.length() - 1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ExcelWrite() throws IOException {
        try (Workbook workbook = new XSSFWorkbook()){

            Sheet sheet = workbook.createSheet("Sheet1");

            String[][] data = {
                    {"Row 1 Cell 1","Row 1 Cell 2","Row 1 Cell 3"},
                    {"Row 2 Cell 1","Row 2 Cell 2","Row 2 Cell 3"}
            };

            for (int i = 0; i< data.length;i++){
                Row row = sheet.createRow(i);
                for (int j = 0;j< data[i].length;j++){
                    Cell cell = row.createCell(j);
                    cell.setCellValue(data[i][j]);
                }
            }
            try(FileOutputStream outputStream = new
                    FileOutputStream("/Users/brianurias/Desktop/example.xlsx")){
                workbook.write(outputStream);

                System.out.println("Excel File has been written");
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
