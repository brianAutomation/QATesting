package TestNG;
//TestNG is a testing framework for Java that provides various annotations to control the behavior of test methods and classes. Here is a list of some of the commonly used annotations in TestNG:
//        1. `@Test`: This annotation is used to mark a method as a test method. Test methods are the actual tests that you want to execute.
//        2. `@BeforeSuite`: This annotation is used to mark a method that should run before all the tests in a suite.
//        3. `@AfterSuite`: This annotation is used to mark a method that should run after all the tests in a suite.
//       4. `@BeforeTest`: This annotation is used to mark a method that should run before all the test methods in a test tag.
//        5. `@AfterTest`: This annotation is used to mark a method that should run after all the test methods in a test tag.
//        6. `@BeforeClass`: This annotation is used to mark a method that should run before all the test methods in a class.
//        7. `@AfterClass`: This annotation is used to mark a method that should run after all the test methods in a class.
//        8. `@BeforeMethod`: This annotation is used to mark a method that should run before each test method.
//        9. `@AfterMethod`: This annotation is used to mark a method that should run after each test method.
//        10. `@DataProvider`: This annotation is used to mark a method as a data provider for test methods. It supplies data for parameterized testing.
//        11. `@Parameters`: This annotation is used to specify parameters for a test method.
//        12. `@Factory`: This annotation is used to mark a method that returns an array of test class instances. It is used for creating instances of a test class for parallel execution.
//        13. `@Listeners`: This annotation is used to specify one or more listener classes for test execution.
//        14. `@Test(enabled = false)`: This annotation is used to disable a specific test method.
//        15. `@Test(dependsOnMethods = {"methodName"})`: This annotation is used to specify the dependency of a test method on another test method.
//        16. `@Test(priority = 1)`: This annotation is used to set the priority of test methods when running them.
//        17. `@Test(expectedExceptions = Exception.class)`: This annotation is used to specify the expected exception for a test method.
//        18. `@Test(timeOut = 5000)`: This annotation is used to set a timeout for a test method in milliseconds.
//       19. `@Test(threadPoolSize = 3)`: This annotation is used to specify the thread pool size for parallel execution of a test method.
//        These are some of the key annotations provided by TestNG. You can use these annotations to control the execution flow, dependencies, parallelism, and behavior of your test methods and classes.

// testing multiple classes at the same time = parrellel testing

//Message qa_automation_august_2023

import org.testng.Assert;
import org.testng.annotations.*;

//        Shift + Return to add a new line
//        Slack needs your permission to enable notifications. Enable notifications
public class Annotations {



        @Test(enabled = false) // will skip the test for this method
        public void testAdd(){
                int result = 3 + 3;
                assert result == 6;
                System.out.println("Test Passed");
        }

        @Test (expectedExceptions = ArithmeticException.class)
        public void byZero(){
                int result = 10/0;
        }

        @Test(priority = 2)
        public void testString(){
                String exp = "HELlO HELLO";
                String Act = "HELlO HELLO";

                Assert.assertEquals(exp,Act,"String Equality Failed");
                //System.out.println("testString test passed");
        }

        @Test(priority = 0)
        public void  ArrayContent(){
                int[] numbs = {1,2,3,4,5,6};
                int TargetNumber = 4;
                boolean ContainsTarget = false;

                for (int num : numbs){
                        if (num == TargetNumber){
                                ContainsTarget = true;
                                break;
                        }
                }
                Assert.assertTrue(ContainsTarget,"Array does not have the target number");
        }

        @Test(priority = 1)
        @Parameters({"param1","param2"})
        public void parameterizedTest(String param1, int param2){
                System.out.println("param 1: " + param1);
                System.out.println("param2: " + param2);

                Assert.assertEquals(param1,"Hello, World!");
                Assert.assertEquals(param2,42);

        }

        @BeforeSuite
        public void BeforeSuite(){
                System.out.println("This method will run before the test Suite");
        }
        @AfterSuite
        public void AfterSuite(){
                System.out.println("This method will run After the test suite is finished");
        }
        @BeforeMethod
        public void BeforeMethod(){
                System.out.println("This test will run before all methods");
        }
        @AfterMethod
        public void AfterMethod(){
                System.out.println("This test will run After all the methods");
        }
        @BeforeClass
        public void BeforeClass(){
                System.out.println("This method will run before each class");
        }
        @AfterClass
        public void AfterClass(){
                System.out.println("This method will run after each class");
        }

}

//this is the correct order:

//@BeforeSuite
//@BeforeClass
//@BeforeMethod
//@test
//@AfterMethod
//@AfterClass
//@AfterSuite
