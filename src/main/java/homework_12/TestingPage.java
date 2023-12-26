package homework_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestingPage {
    private static final String TESTING_PAGE = "https://ithillel.ua/courses/testing";
    private static final String COURSES_CSS_SELECTOR = "profession-bar_title";
    private static final String ADDITIONAL_COURSES_CSS_SELECTOR = "profession-bar_title";
    private static final String PROGRAMMING_BUTTON = "//a[contains(text(),'Програмування')]";
    private static final String MANAGEMENT_BUTTON = "//a[contains(text(),'Менеджемент')]";

    private final WebDriver driver;
    protected WebElement programmingButton;
    protected WebElement managementButton;

    protected TestingPage(WebDriver driver) {
        this.driver = driver;
    }

    protected TestingPage openPage() {
        driver.get(TESTING_PAGE);
        return this;
    }

    protected List<String> getCourses() {
        List<WebElement> coursesNames = driver.findElements(By.className(COURSES_CSS_SELECTOR));
        return coursesNames.stream().map(WebElement::getText).toList();
    }

    protected List<String> getAdditionalCourses() {
        List<WebElement> coursesNames = driver.findElements(By.className(ADDITIONAL_COURSES_CSS_SELECTOR));
        return coursesNames.stream().map(WebElement::getText).toList();
    }

    void clickToProgrammingButton() {
        if (programmingButton == null) {
           programmingButton = driver.findElement(By.xpath(PROGRAMMING_BUTTON));
        }
        programmingButton.click();
    }

    void clickToManagementButton() {
        if (managementButton == null) {
            managementButton = driver.findElement(By.xpath(MANAGEMENT_BUTTON));
        }
        managementButton.click();
    }

    protected void goToCategory(String category) {
        switch (category) {
            case "Програмування" -> clickToProgrammingButton();
            case "Менеджмент" -> clickToManagementButton();
        }
    }
}
