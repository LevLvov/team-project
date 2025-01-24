package page;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement loginButton(){
        return findLocator("//a[@href='/login']");
    }

    public WebElement emailAddress(){
        return findLocator("//input[@data-qa='login-email']");
    }

    public WebElement password(){
        return findLocator("//input[@data-qa='login-password']");
    }

    public WebElement clickLoginButton() {
        return findLocator("//button[@data-qa='login-button']");
    }

    public WebElement clickDelete() {
        return findLocator("//a[@href='/delete_account']");
    }

}
