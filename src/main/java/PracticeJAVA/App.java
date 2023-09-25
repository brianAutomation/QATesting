package PracticeJAVA;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!:");

        ExcelReader service = new ExcelReader();
        service.writeToExcelSheet();
    }
}
