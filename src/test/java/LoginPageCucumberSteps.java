import classwork_22.ConfigProvider;
import classwork_23.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class LoginPageCucumberSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    @Given("Open login page")
    public void openPage() {
        System.out.println("setUp before method");
        WebDriver driver = ConfigProvider.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.openPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("Fill email")
    public void fillEmailField(){
        loginPage.fillEmailField("sd@sdf");
    }
    @When("Fill password")
    public void fillPasswordField(){
        loginPage.fillPasswordField("sd@sdf");
    }
    @When("Click button")
    public void clickButton(){
        loginPage.clickSignInButton();
    }
    @Then("Expected error message")
    public void assertMessage(){
        String expectedValidationMessage = "Неправильна адреса електронної пошти";
        List<String> actualValidationMessages = loginPage.getValidationMessages();
        Assert.assertTrue(actualValidationMessages.contains(expectedValidationMessage));

    }
}
