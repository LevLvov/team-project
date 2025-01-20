package tests;

import BaseClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class AuthTestIncorrectData extends TestInit {

    @Test
    public void checkValidLogin() {
        HomePage homePage = new HomePage(driver);
        getUrl("http://automationexercise.com");
        homePage.loginButton().click();
        homePage.emailAddress().sendKeys("SofiaSof@gmail.com");
        homePage.password().sendKeys("666666");
        homePage.clickLoginButton().click();
//        homePage.clickDelete().click();
        boolean errMessage = homePage.errorMessage().isDisplayed();
        Assert.assertTrue(errMessage);





    }

}
