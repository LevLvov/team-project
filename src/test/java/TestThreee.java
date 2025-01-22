import BaseClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;

public class TestThreee extends TestInit {
    @Test
    public void testhree(){
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        getUrl("https://www.automationexercise.com/login");
        registrationPage.enterPasswOne().sendKeys("passworddd");
        registrationPage.enterEma().sendKeys("vasyl@i.ua");
        registrationPage.logBut().click();
        Assert.assertTrue(registrationPage.wrongLogPass().getText().contains("Your email or password is incorrect!") );
    }
}
