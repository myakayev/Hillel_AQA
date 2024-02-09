import classwork_22.ConfigProvider;
import classwork_23.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LoginPageTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod // буде використовуватись перед кожним тестом
    public void setUp() {
        System.out.println("setUp before method");
        driver = ConfigProvider.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown after method");
        driver.quit();
    }

    @Test
    public void invalidEmailLoginTest(){
        String email = "wewr@ds";
        String pass = "pass";
        String expectedValidationMessage = " Неправильна адреса електронної пошти ";

        loginPage.fillEmailField(email).fillPasswordField(pass);

        List<String> actualValidationMessages = loginPage.getValidationMessages();
        System.out.println(actualValidationMessages);
        Assert.assertTrue(actualValidationMessages.contains(expectedValidationMessage));
    }
}
