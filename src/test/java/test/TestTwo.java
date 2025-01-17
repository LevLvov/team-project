package test;

import BaseClasses.TestInit;
import org.testng.annotations.Test;
import page.HomePage;

public class TestTwo extends TestInit {


    // TODO
    @Test
    public void checkValidLogin() {
        HomePage homePage = new HomePage(driver);
        getUrl("http://automationexercise.com");
        homePage.loginButton().click();
        homePage.emailAddress().sendKeys("SofiaSof@gmail.com");
        homePage.password().sendKeys("666666");
        homePage.clickLoginButton().click();
        homePage.clickDelete().click();


    }


}
