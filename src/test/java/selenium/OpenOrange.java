package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenOrange {

    private WebDriver driver;



    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void openOrange(){
        String URL= "https://www.google.com";
        driver.get(URL);
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String Actual = driver.getCurrentUrl();
        String Expected = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        Assert.assertEquals(Actual, Expected);
    }

    @DataProvider(name = "userCredentials")
    public Object [][] userCredentials(){

        return new Object[][]{
                {"admin","admin123"},
//                {"Admin","admin123"},
//                {"Admin123","admin"},
//                {"admin","admin1234"},
//                {"admin","Admin123"},
//                {"admin"," "},
//                {" ","admin123"},
        };
    } // it'll run through the passwords / usernames until one works


    @Test(dependsOnMethods = "openOrange", dataProvider = "userCredentials")
    public void loginOrange(String username, String password){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.findElement(By.name("username")).click();
//        driver.findElement(By.name("username")).sendKeys("Admin");;
//        driver.findElement(By.name("password")).click();
//        driver.findElement(By.name("password")).sendKeys("admin123");
//
//        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        WebElement usernameField = driver.findElement(By.name("username")); // data type / variable / now you can use the variable as many times as you want
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));


        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

        Wait<WebDriver> wait = new FluentWait<>(driver) // constructor -driver as argument to constructor, wait for 10 sec, try finding elem every 500 mil sec // ignore if you can't find element, then assert
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class); // if it's not able to find the element in 10 seconds, then keep going assert it / display that login is unscessful

        WebElement dashboardTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"))); // this is what is being tried

        Assert.assertTrue(dashboardTitle.isDisplayed(), "Login was not successful.");

    }

    @Test (dependsOnMethods = "loginOrange")// put WebElement in a diff class - classname.methodname.sendKeys
    public void checkUser(){


        WebElement adminBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // wait should be after button is clicked


        adminBtn.click();

        Wait<WebDriver> wait = new FluentWait<>(driver) // constructor -driver as argument to constructor, wait for 10 sec, try finding elem every 500 mil sec // ignore if you can't find element, then assert
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(org.openqa.selenium.NoSuchElementException.class); // do this when we're on a new page^^^

        WebElement adminTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span")));
        Assert.assertTrue(adminTitle.isDisplayed(),"Admin page not successful");

        WebElement userNameButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
        WebElement userRoleButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
        WebElement employeeNameButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
        WebElement statusButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));


       userNameButton.click();
//        userNameButton.sendKeys("Admin");
//        employeeNameButton.click();
//        employeeNameButton.sendKeys("Paul Collings");
//        statusButton.click();


    }



    @AfterTest
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}

//DOCUMENTS BEFORE TESTING:
// plans
// test strategy
// traceability matrix
// test cases

// as soon as you
// learn postman!!! API tool for testing APIs


