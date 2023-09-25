package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class OpenGoogleTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp(){
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        WebDriverManager.safaridriver().setup();
//        driver = new SafariDriver();
    }

    @Test
    public void openGoogle(){
        String URL = "https://www.google.com";
        driver.get(URL);
        //driver.navigate().to("url"); --
        //String Actual = driver.getCurrentUrl();
        //String expected = "url";
        String Actual = driver.getCurrentUrl();
        String Expected = "https://www.google.com/";
        Assert.assertEquals(Actual,Expected);
    }
    @Test(dependsOnMethods = {"openGoogle"})
    public void Search(){
        driver.findElement(By.className("gLFyf")).click(); // search class name
        driver.findElement(By.className("gLFyf")).sendKeys("amazon");
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.className("LC20lb")).click(); // amazon link

        String Expected = "Amazon.com. Spend less. Smile more.";
        String Actual = driver.getTitle();

        Assert.assertEquals(Actual,Expected);
    }

    @Test(dependsOnMethods = "Search")
    public void SearchAmazon() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
    //    driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear(); review uses of .clear - simple editing tool to clear string and enter new string
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("socks");
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();

  //      int numberOfSocksDisplayed = driver.findElements(By.xpath("//span[contains(text(),'socks')]")).size();
  //      System.out.println(numberOfSocksDisplayed);
  //      int expectedNumberOfSocks = 11;
  //      Assert.assertEquals(numberOfSocksDisplayed,expectedNumberOfSocks);

        //use a List because Lists do not require loops, what we're doing here is finding how many
        // "socks" are on the Amazon page (first page)
        // we're testing to see if it gets it right.
        //So instead of counting each sock, you can find the data-component-type element
        // and we'll find the .size() of it

        List<WebElement> sockElement = driver.findElements
                (By.xpath("//div[@data-component-type='s-search-result']"));// very important!!! practice after class
                int actualNumber = sockElement.size();
                int expectedNumber = 60;
                System.out.println(actualNumber);

                Assert.assertEquals(actualNumber,expectedNumber);
    }

    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
//Selenium Waits:
//Fluent Wait
//Explicit Wait
//Implicit Wait

//Fluent Wait??
//Fluent waits are similar to explicit waits but it allows user to define custom poling intervals
//you can specify the maximum wait time and polling frequency
//this is useful when you need more control over how often selenium checks for a given condition

//Explicit Wait??
//explicit waits are used to wait for a specific condition to be met before preceeding with this
//script execution
//you can specify maximum wait time and a condition to wait for,e.g.: element visible or clickable
//the WebDriverWait class and the expected condition module are commonly used for explicity wait

//Implicit Wait?
//implicit waits are used to set a default time for all elements in the WbDriver instance.
//if an element is not immediately available, selenium will wait for the specific amount of time
//before throwing an exception.

//HTML POINTERS to find ELEMENTS in SELENIUM
// by xPath
// by className
// by id
// by cssSelector
// by Name
// by linkText
// by TagName

//xPath
// Absolute xPath
// Relative xPath

//Absolute xPath?
// absolute xPath expression specifies the exact location on an element from the root of the
// document, it starts with a single / .
// while absolute xPath can be very precise they are no longer and brittle as they rely on the complete
// structure of the html document

//Relative xPath?
// A relative xPath expression specifies the location of the element relative to another element
// on the html document. It does not start from the root of the page but rather from a specific
// reference point or a context
// relative xPaths are more dynamic and less likely to fail and break the structure of html documents
// if the page changes relative xPath finds the reference point between the elements to find the given
// element. They focus on the relationship between the elements







