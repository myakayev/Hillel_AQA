package homework_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestingPage {
    private static final String TESTING_PAGE = "https://ithillel.ua/courses/testing";
    private static final String COURSES_XPATH_SELECTOR = "//*[contains(text(), 'QA')]/ancestor::*[@class='block-profession_group']//*[@class='profession-bar_title']";
    private static final String ADDITIONAL_COURSES_XPATH_SELECTOR = "//*[contains(text(), 'Додаткові')]/ancestor::*[@class='block-profession_group']//*[@class='profession-bar_title']";
    private static final String OPPORTUNITIES_SEARCH_TITLE = "p[class='opportunity-item_title p-l']']//*[@class='profession-bar_title']";
    private static final String OPPORTUNITIES_SEARCH_DESCRIPTION = "//p[@class='p-s opportunity-item_descr']";

    private static final String PROGRAMMING_BUTTON = "//a[contains(text(),'Програмування')]";
    private static final String MANAGEMENT_BUTTON = "//a[contains(text(),'Менеджемент')]";
    private static final String MARKETING_BUTTON = "//a[contains(text(),'Маркетинг')]";
    private static final String DESIGN_BUTTON = "//a[contains(text(),'Дизайн')]";
    private static final String TEEN_COURSES_BUTTON = "//a[contains(text(),'Підліткові курси')]";

    private final WebDriver driver;
    protected WebElement programmingButton;
    protected WebElement managementButton;
    protected WebElement marketingButton;
    protected WebElement designButton;
    protected WebElement teensCoursesButton;

    protected TestingPage(WebDriver driver) {
        this.driver = driver;
    }

    protected TestingPage openPage() {
        driver.get(TESTING_PAGE);
        return this;
    }

    protected List<String> getCourses() {
        List<WebElement> coursesNames = driver.findElements(By.xpath(COURSES_XPATH_SELECTOR));
        return coursesNames.stream().map(WebElement::getText).toList();
    }

    protected List<String> getAdditionalCourses() {
        List<WebElement> coursesNames = driver.findElements(By.xpath(ADDITIONAL_COURSES_XPATH_SELECTOR));
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

    void clickToMarketingButton() {
        if (marketingButton == null) {
            marketingButton = driver.findElement(By.xpath(MARKETING_BUTTON));
        }
        marketingButton.click();
    }

    void clickToDesignButton() {
        if (designButton == null) {
            designButton = driver.findElement(By.xpath(DESIGN_BUTTON));
        }
        designButton.click();
    }

    void clickToTeensCoursesButton() {
        if (teensCoursesButton == null) {
            teensCoursesButton = driver.findElement(By.xpath(TEEN_COURSES_BUTTON));
        }
        teensCoursesButton.click();
    }

    protected void goToCategory(String category) {
        switch (category) {
            case "Програмування" -> clickToProgrammingButton();
            case "Менеджмент" -> clickToManagementButton();
            case "Дизайн" -> clickToDesignButton();
            case "Маркетинг" -> clickToMarketingButton();
            case "Підліткові курси" -> clickToTeensCoursesButton();
            default -> throw new IllegalArgumentException("Wrong data");
        }
    }
    protected List<String> getOpportunities(){
        List<WebElement> opportunitiesTitle = driver.findElements(By.cssSelector(OPPORTUNITIES_SEARCH_TITLE));
        List<WebElement> opportunities = driver.findElements(By.xpath(OPPORTUNITIES_SEARCH_DESCRIPTION));
        for (WebElement oportunity: opportunities
             ) {

        }
        return opportunities.stream().map(WebElement::getText).toList();
    }
}
