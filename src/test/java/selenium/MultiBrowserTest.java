package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultiBrowserTest {
    private WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome")String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }else {
            throw new IllegalArgumentException("Invalid Browser Name: " + browser);
        }
    }

    @Test
    public void testExample(){
        driver.get("https://www.yahoo.com");
        String Expected = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String Actual = driver.getTitle();
        Assert.assertEquals(Expected,Actual);


        JavascriptExecutor js = (JavascriptExecutor) driver;//look up things you can do with jsexecutor but always use selenium first
        js.executeScript("window.scrollBy(0,500);"); // it does javascript commands, if you want change fonts, or reset page, command, scroll down or up, control mouse, keyboard events
        //whatever Javascript can do, the executor can do
        //selenium can only do things with html like minimize a window or maximize

        long loadTime = (Long) js.executeScript("return window.performance.timing.loadEventEnd - " +
                "window.performance.timing.navigationStart;");

        System.out.println("Website Load Time: " + loadTime);

    }

    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }


}
