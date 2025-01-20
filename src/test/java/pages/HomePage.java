package pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement loginButton() {
        return findLocator("//a[@href='/login']");
    }

    public WebElement enterName() {
        return findLocator("//input[@name='name']");
    }

    public WebElement enterEmail() {
        return findLocator("//input[@data-qa='signup-email']");
    }

    public WebElement signUpbutton() {
        return findLocator("//button[@data-qa='signup-button']");
    }


    public WebElement emailAddress() {
        return findLocator("//input[@data-qa='login-email']");
    }


    public WebElement password() {
        return findLocator("//input[@data-qa='login-password']");
    }


    public WebElement clickLoginButton() {
        return findLocator("//button[@data-qa='login-button']");
    }


    public WebElement clickDelete() {
        return findLocator("//a[@href='/delete_account']");
    }

    public WebElement errorMessage() {
        return findLocator("//div[@class=\"login-form\"][.//text()[contains(.,'Your email or password is incorrect!')]]");
    }


}

