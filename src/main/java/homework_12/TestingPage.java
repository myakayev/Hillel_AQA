package homework_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestingPage {
    String TESTING_PAGE = "https://ithillel.ua/courses/testing";
    private final WebDriver driver;

    protected TestingPage(WebDriver driver) {
        this.driver = driver;
    }

    protected TestingPage openPage() {
        driver.get(TESTING_PAGE);
        return this;
    }
    protected List<String> getCourses() {
        List<WebElement> coursesNames = driver.findElements(By.className("profession-bar_title"));
        return coursesNames.stream().map(WebElement::getText).toList();
    }
    protected List<String> getAdditionalCourses() {
        List<WebElement> coursesNames = driver.findElements(By.className("profession-bar_title"));
        return coursesNames.stream().map(WebElement::getText).toList();
    }
}
