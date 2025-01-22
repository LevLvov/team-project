package tests;

import BaseClasses.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class Logout extends TestInit {

//    @Test
    public void registration(){
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        getUrl("https://automationexercise.com/login");
        homePage.loginButton().click();
        homePage.enterName().sendKeys("Testing");
        homePage.enterEmail().sendKeys("Testing@i.ua");
        homePage.signUpbutton().click();
        registrationPage.mrSelect().click();
        registrationPage.enterPass().sendKeys("666666");
        scrollToElement(registrationPage.firstName());
        registrationPage.selectDays().click();registrationPage.dayOf().click();
        registrationPage.selectMonth().click();registrationPage.monthOf().click();
        registrationPage.selectYear().click();registrationPage.yearOf().click();
        registrationPage.firstName().sendKeys("Tester");
        registrationPage.lastName().sendKeys("Ivanych");
        registrationPage.enterAddress().sendKeys("Toronto");
        scrollToElement(registrationPage.numberName());
        registrationPage.selectCount().click();
        registrationPage.countryName().click();
        registrationPage.stateName().sendKeys("Ontario");
        registrationPage.cityName().sendKeys("Boiler");
        registrationPage.zipcodeName().sendKeys("123");
        registrationPage.numberName().sendKeys("+380973332211");
        registrationPage.regButton().click();
        registrationPage.contButton().click();

    }

    @Test
    public  void logout () {
        HomePage homePage = new HomePage(driver);
        getUrl("https://automationexercise.com/login");
        homePage.emailAddress().sendKeys("Testing@i.ua");
        homePage.password().sendKeys("666666");
        homePage.clickLoginButton().click();
        homePage.logOut().click();

        String expectedLoginUrl = "https://automationexercise.com/login";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals( expectedLoginUrl, actualUrl, "Користувача не перенаправлено на сторінку входу!");

    }
}
