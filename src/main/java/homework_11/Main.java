package homework_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.get("https://ithillel.ua/");
        WebElement courseButton = browser.findElement(By.cssSelector("button.site-nav-link[data-dropdown-trigger*='coursesMenu']"));
        // WebElement courseButton = browser.findElement(By.xpath("//button[@data-dropdown-trigger = 'coursesMenu']"));
        // WebElement contactButton3 = browser.findElement(By.xpath("//button[contains(@data-dropdown-trigger, 'ursesMenu')]"));
        courseButton.click();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement programmingButton = browser.findElement(By.xpath("//button[@data-category='programming']"));
        programmingButton.click();
        WebElement frontEndBasicButton = browser.findElement(
                By.xpath("//a[@class='course-label -alt' and @href='https://ithillel.ua/courses/front-end-basic']"));
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        frontEndBasicButton.click();

        WebElement coaches = browser.findElement(By.cssSelector(".-coaches"));
        ((JavascriptExecutor)browser).executeScript("scrollTo (" + coaches.getLocation().x + "," + coaches.getLocation().y + ")");

        WebElement button = browser.findElement(By.id("coachesShowAllButton"));
        button.click();

        List<WebElement> coachNames = browser.findElements(By.className("coach-card_name"));
        List<String> listNames = coachNames.stream().map(WebElement::getText).toList();
        System.out.println(listNames);
        Thread.sleep(3000);
        browser.quit();
    }
}
