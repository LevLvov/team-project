package tests;

import BaseClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegisterUserWithExistingEmail extends TestInit {
    @Test
    public void UserWithExistingEmail (){
        HomePage homePage = new HomePage(driver);
        getUrl("https://automationexercise.com/login");
        homePage.enterEmail().sendKeys("Testing@i.ua");
        homePage.enterName().sendKeys("Testing");
        homePage.signUpbutton().click();
        Assert.assertTrue(homePage.emailAddressAlreadyExist().getText().contains("Email Address already exist!"));
    }
}
