package BaseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;

    public void getUrl(String url) {
        driver.get(url);
    }

    public void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }


    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void close () {
        driver.quit();
    }

}
