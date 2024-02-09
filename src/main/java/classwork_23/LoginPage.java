package classwork_23;

import classwork_18.AbstractPage;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.Logger;
@Slf4j
public class LoginPage extends AbstractPage {

    private static final String LOGIN_PATH = "https://lms.ithillel.ua/auth";
    @FindBy (css = ".validation-messages__item.ng-star-inserted")
    private List<WebElement> validationMessages;
    @FindBy(css = ".hi-input[type='email']")
    private WebElement emailField;

    @FindBy(css = ".hi-input[type='password']")
    private WebElement passwordField;
    @FindBy(css = ".hi-button[type='submit']")
    private WebElement signButton;

    public LoginPage(WebDriver driver) {
        super (driver);
    }

    @Override
    public LoginPage openPage() {
        log.info("Open login page");
        driver.get(LOGIN_PATH);
        return this;
    }

    public LoginPage fillEmailField (String email) {
        emailField.sendKeys(email);
        return this;
    }

    public LoginPage fillPasswordField(String pass){
        log.info("Fill email field with value: {}", pass);
        passwordField.sendKeys(pass);
        return this;
    }

    public void clickSignInButton(){
        log.info("Click sign in button");
        signButton.click();
    }

    public List<String>  getValidationMessages(){
        return validationMessages.stream().map(WebElement::getText).toList();
    }

    public LoginPage fillForm(User user){
        emailField.sendKeys(user.getEmail());
        passwordField.sendKeys(user.getPassword());
        return this;
    }

}
