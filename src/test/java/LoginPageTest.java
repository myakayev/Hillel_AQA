import classwork_22.ConfigProvider;
import classwork_23.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class LoginPageTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod // буде використовуватись перед кожним тестом
    public void setUp() {
        System.out.println("setUp before method");
        driver = ConfigProvider.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.openPage();    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown after method");
        driver.quit();
    }

    public void invalidEmailLoginTest(){
        String email = "wewr@ds";
        String pass = "pass";

        loginPage.fillEmailField(email).fillPasswordField(pass);
    }
}
