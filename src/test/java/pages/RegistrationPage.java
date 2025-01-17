package pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public WebDriver driver;
    public WebElement mrSelect(){
        return findLocator("//input[@value='Mr']");
    }
    public WebElement enterPass(){
        return findLocator("//input[@id='password']");
    }
//    public WebElement selectDays(){
//        return findLocator("//select[@name='days']");
//    }

    public WebElement selectDays(){
        return waitClickableElement("//select[@id='days']");
    }

    public WebElement dayOf(){
        return findLocator("//div/select/option[@value='13']");
    }
    public WebElement selectMonth(){
        return findLocator("//select[@name='months']");
    }
    public WebElement monthOf() {
        return findLocator("//div/select/option[@value='12']");
    }
    public WebElement selectYear(){
        return findLocator("//select[@name='years']");
    }
    public WebElement yearOf() {
        return findLocator("//div/select/option[@value='1999']");
    }
    public WebElement firstName(){
        return findLocator("//*[@id='first_name']");
    }
    public WebElement lastName(){
        return findLocator("//*[@id='last_name']");
    }
    public WebElement stateName(){
        return findLocator("//*[@id='state']");
    }
    public WebElement cityName(){
        return findLocator("//*[@id='city']");
    }
    public WebElement zipcodeName(){
        return findLocator("//*[@id='zipcode']");
    }
    public WebElement numberName(){
        return findLocator("//*[@id='mobile_number']");
    }
    public WebElement countryName(){
        return findLocator("//p/select/option[@value='Canada']");
    }
    public WebElement selectCount(){
        return findLocator("//p/select[@name='country']");
    }

    public WebElement enterAddress(){
        return findLocator("//*[@id='address1']");
    }
    public WebElement regButton(){
        return findLocator("//*[@id=\"form\"]/div/div/div/div/form/button");
    }
    public WebElement contButton(){
        return findLocator("//div/a[@data-qa]");
    }
    public WebElement delAcount(){
        return findLocator("//a[@href='/delete_account']");
    }



}

