package classwork_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainHillelPage {

    public static final String  MAIN_URL = "https://ithillel.ua/";
    public static final String  CONTACT_CSS_SELECTOR  = ".site-nav-btn[href*='contact']";
    private static final String BLOG_CSS_SELECTOR = ".site-nav-btn[href*='blog']";
    private static final String COURSES_DROPDOWN_CSS_SELECTOR = ".site-nav-btn[data-dropdown-trigger='coursesMenu']";
    private WebDriver driver;
    private WebElement contactButton;
    private WebElement blogButton;
    private WebElement coursesDropdown;

    public MainHillelPage(WebDriver driver) {
        this.driver = driver;
        //contactButton = driver.findElement(By.cssSelector(CONTACT_CSS_SELECTOR));
        //blogButton = driver.findElement(By.cssSelector(BLOG_CSS_SELECTOR));
        //coursesDropdown = driver.findElement(By.cssSelector(COURSES_DROPDOWN_CSS_SELECTOR));

    }

    public void openMainPage() {
        driver.get(MAIN_URL);
    }
    public void clickToBlogButton() {
        if (blogButton == null){
            blogButton = driver.findElement(By.cssSelector(BLOG_CSS_SELECTOR));
        }
        blogButton.click();
    }
}
