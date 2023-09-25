package TestNG;

import org.testng.annotations.Test;

public class DependentTest {
    @Test
    public void StartApp(){
        System.out.println("application starting");
    }

    @Test (dependsOnMethods = "StartApp" )
    public void performLogin(){
        System.out.println("user will log in");
    }

    @Test (dependsOnMethods = "performLogin")
    public void performAction(){
        System.out.println("user is taking out money");
    }
}
