package BaseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    int BASIC_TIME = 10;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement findLocator(String locator) {
        return driver.findElement(By.xpath(locator));
    }


    public List<WebElement> findLocators(String locators) {
        return driver.findElements(By.xpath(locators));
    }

    public List<WebElement> waitClickableAllElements(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));

    }

    public WebElement waitClickableElement(String locator) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));

    }
//
    public WebElement waitVisibleOfElement(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }
//
    public List<WebElement> waitVisibleOfAllElements(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(BASIC_TIME));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        return driver.findElements(By.xpath(locator));
    }

    public void action(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
}
