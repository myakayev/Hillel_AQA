import classwork_22.ConfigProvider;
import classwork_23.LoginPage;
import classwork_23.User;
import com.github.javafaker.Faker;
import org.mockito.Mockito;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

 //   @Test(dataProvider = "generateUserWithInvalidEmail")
    @Test
    public void invalidEmailLoginTest() throws InterruptedException {
        String email = "wewr@ds";
        String pass = "pass";
        String expectedValidationMessage = "Неправильна адреса електронної пошти";

        User user = Mockito.mock(User.class);
        Mockito.when(user.getEmail()).thenReturn("wewr@ds");
        Mockito.when(user.getPassword()).thenReturn("pass");
        User spy = Mockito.spy(user); // мокіто буде слфдкувати за цим об'єктом
       // loginPage.fillForm(generateInvalidUser()).clickSignInButton();
        loginPage.fillEmailField(email).fillPasswordField(pass);
       Thread.sleep(3000);

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

//    @DataProvider
//    private Object [] generateUserWithInvalidEmail(){ // це шось не працює(
//        String [] email = {"sdfhsj@dkjsd", "kjdf@dkd", "jsds", "jjk.com"};
//        String pass = "pass";
//        return Arrays.stream(email).map(mail -> User.builder().email(mail).password(pass).build()).toArray();
//
//    }
}
