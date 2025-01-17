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


}

