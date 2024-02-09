package classwork_18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public abstract <T extends AbstractPage> T openPage();

    protected void openPage(String url){
        driver.get(url);
    }

}
