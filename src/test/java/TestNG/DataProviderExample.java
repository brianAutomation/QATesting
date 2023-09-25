package TestNG;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderExample {

    @DataProvider(name = "additionData")
    public Object[][] additionData(){
        return new Object[][]{
                {2,3,5},
                {0,1,1},
                {-1,1,0},
                {10,-5,5}
        };
    }

    @Test(dataProvider = "additionData")
    public void testAddition(int num1, int num2, int ExpectedResult){
        int result = num1 + num2;

        Assert.assertEquals(result,ExpectedResult,"Addition test Failed");
    }
}
