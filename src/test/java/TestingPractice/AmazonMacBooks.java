package TestingPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;

public class AmazonMacBooks {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle(){
        String URL = "https://www.google.com";
        driver.get(URL);

        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.google.com/";

        Assert.assertEquals(Actual,Expected);
    }

    @Test(dependsOnMethods = "openGoogle")
    public void openAmazon(){
        WebElement clickTab = driver.findElement(By.className("gLFyf"));


        clickTab.click();
        clickTab.sendKeys("Amazon");
        clickTab.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"tads\"]/div/div/div/div/div[1]/a")).click();

        String Actual = "Amazon.com. Spend less. Smile more.";
        String Expected = driver.getTitle();

        Assert.assertEquals(Actual,Expected);


    }

    @Test(dependsOnMethods = "openAmazon")
    public void SearchMacBooks(){
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));

        search.click();
        search.sendKeys("Macbook");
        search.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String Actual = "Amazon.com : Macbook";
        String Expected = driver.getTitle();

        Assert.assertEquals(Actual,Expected);

    }

    @Test
    public void countMacBooks(){

    }
}
