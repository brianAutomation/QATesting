package TestingPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class openTwitterAndLogout {
    private WebDriver driver;


    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle(){
        String URL= "https://www.google.com";
        driver.get(URL);
        driver.navigate().to("https://twitter.com/i/flow/login");

        String Actual = driver.getCurrentUrl();
        String Expected = "https://twitter.com/i/flow/login";

        Assert.assertEquals(Actual, Expected);
    }

    @Test(dependsOnMethods = "openGoogle")
    public void openTwitter(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement clickTab = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input"));
        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]"));


        clickTab.click();
        clickTab.sendKeys("thirdparty.perspective93@gmail.com");
        nextButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement passwordButton = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/main/div/div/div/div[2]/div[2]/div[1]/div/div/div[2]/label/div/div[1]"));

        passwordButton.sendKeys("ThirdpartyBrian");
        passwordButton.sendKeys(Keys.ENTER);

//        String Actual = "Amazon.com. Spend less. Smile more.";
//        String Expected = driver.getTitle();
//
//        Assert.assertEquals(Actual,Expected);


    }

//    @Test(dependsOnMethods = "openAmazon")
//    public void SearchMacBooks(){
//        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//
//        search.click();
//        search.sendKeys("Macbook");
//        search.sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        String Actual = "Amazon.com : Macbook";
//        String Expected = driver.getTitle();
//
//        Assert.assertEquals(Actual,Expected);
//
//    }

    @Test
    public void countMacBooks(){

    }
}
