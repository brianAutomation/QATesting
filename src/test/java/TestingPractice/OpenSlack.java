package TestingPractice;

import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenSlack {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openSlack(){
        String URL= "https://www.google.com";
        driver.get(URL);
        driver.navigate().to("https://slack.com/workspace-signin");

        String Actual = driver.getCurrentUrl();
        String Expected = "https://slack.com/workspace-signin";

        Assert.assertEquals(Actual, Expected);
    }

   @Test(dependsOnMethods = "openSlack")
   public void loginSlackPage(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.findElement(By.name("username")).click();
//        driver.findElement(By.name("username")).sendKeys("Admin");;
//        driver.findElement(By.name("password")).click();
//        driver.findElement(By.name("password")).sendKeys("admin123");
//
//        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        WebElement workSpaceURL = driver.findElement(By.xpath("//*[@id=\"domain\"]")); // data type / variable / now you can use the variable as many times as you want
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"page_contents\"]/div/div/div[1]/div[2]/form/button"));


        workSpaceURL.sendKeys("CreativeCodingcollect");
        continueButton.click();

       Wait<WebDriver> wait = new FluentWait<>(driver) // constructor -driver as argument to constructor, wait for 10 sec, try finding elem every 500 mil sec // ignore if you can't find element, then assert
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofMillis(500))
               .ignoring(org.openqa.selenium.NoSuchElementException.class);

       WebElement creativeCodingCollective = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page_contents\"]/div/div/div[2]/h1/span")));
       Assert.assertTrue(creativeCodingCollective.isDisplayed(),"Not successful");

   }

   @Test(dependsOnMethods = "loginSlackPage")
   public void enterCredentialsInToSlack(){
        WebElement signinButton = driver.findElement(By.xpath("//*[@id=\"page_contents\"]/div/div/div[2]/div[3]/div[4]/span/a"));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       signinButton.click();

       WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
       WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
       WebElement signIn = driver.findElement(By.xpath("//*[@id=\"signin_btn\"]"));

       email.sendKeys("uriasbrian10@gmail.com");
       password.sendKeys("Determined123");
       signIn.click();

       Wait<WebDriver> wait = new FluentWait<>(driver) // constructor -driver as argument to constructor, wait for 10 sec, try finding elem every 500 mil sec // ignore if you can't find element, then assert
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofMillis(500))
               .ignoring(org.openqa.selenium.NoSuchElementException.class); // do this when we're on a new page^^^

       WebElement general = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"c-coachmark-anchor\"]/button")));
       Assert.assertTrue(general.isDisplayed(),"not successful");

   }

   @Test(dependsOnMethods = "enterCredentialsInToSlack")
    public void emailToHarsh(){

//          driver.findElement(By.id("D05N16WNC5S")).click();
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement newMessage = driver.findElement(By.xpath("//*[@id=\"ws_channel_sidebar\"]/div[1]/div[2]/button"));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       newMessage.click();

       Wait<WebDriver> wait = new FluentWait<>(driver) // constructor -driver as argument to constructor, wait for 10 sec, try finding elem every 500 mil sec // ignore if you can't find element, then assert
               .withTimeout(Duration.ofSeconds(10))
               .pollingEvery(Duration.ofMillis(500))
               .ignoring(org.openqa.selenium.NoSuchElementException.class);

       WebElement newMessageText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[1]/div[5]/div[2]/div/div[2]/div/div/div/div[3]/button")));
       Assert.assertTrue(newMessageText.isDisplayed(),"not successful");


        WebElement emailSearchTab = driver.findElement(By.xpath("//*[@id=\"composer_page__destination\"]"));
        WebElement harshEmail = driver.findElement(By.xpath("//*[@id=\"composer_page__destination_option_0\"]"));

        emailSearchTab.sendKeys("harsh");
        harshEmail.click();
   }

//    @Test(dependsOnMethods = "enterCredentialsInToSlack")
//    public void emaitoPatrick(){
//        driver.findElement(By.id("D05MYLH6DH9")).click();
//
//    }

   @Test(dependsOnMethods = "emailToHarsh")
    public void typeEmail(){
        WebElement message = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div[2]/div/div[3]/div/div/div[3]/div/div[2]/div/div/div[2]/div/div[1]"));

        message.sendKeys("Hello Harsh, is it hard to find remote QA jobs?");
        Assert.assertTrue(message.isDisplayed());

//       message.sendKeys(Keys.ENTER);



   }

//    @AfterTest
//    public void tearDown(){
//        if(driver != null){
//            driver.quit();
//        }
//    }

}


// WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[5]/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[3]/span/button[1]"));

// button.click();