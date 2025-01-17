package tests;

import BaseClasses.TestInit;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class TestOne extends TestInit {

    // TODO assert
    @Test
    public void testOne(){
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        getUrl("https://www.automationexercise.com/");
        homePage.loginButton().click();
        homePage.enterName().sendKeys("Test");
        homePage.enterEmail().sendKeys("Test@i.ua");
        homePage.signUpbutton().click();
        registrationPage.mrSelect().click();
        registrationPage.enterPass().sendKeys("p@ssw0rd");
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
        registrationPage.numberName().sendKeys("+3809505647777");
        registrationPage.regButton().click();
        registrationPage.contButton().click();
        registrationPage.delAcount().click();

    }
    }



