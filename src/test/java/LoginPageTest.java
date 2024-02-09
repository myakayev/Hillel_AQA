import classwork_22.ConfigProvider;
import classwork_23.LoginPage;
import classwork_23.User;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class LoginPageTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeMethod
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
        String expectedValidationMessage = "Неправильна адреса електронної пошти";

        //loginPage.fillForm(generateInvalidUser());
        loginPage.fillEmailField(email).fillPasswordField(pass);

        List<String> actualValidationMessages = loginPage.getValidationMessages();
        Assert.assertTrue(actualValidationMessages.contains(expectedValidationMessage));
    }

    private User generateInvalidUser(){
        Faker faker = new Faker();
        return User.builder()
                .email(faker.internet().emailAddress())
                .password(faker.internet().password())
                .build();
    }
}
