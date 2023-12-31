package homework_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        TestingPage testingPage = new TestingPage(browser);
        testingPage.openPage();
        System.out.println(testingPage.getCourses());
        System.out.println(testingPage.getAdditionalCourses());
        System.out.println(testingPage.getOpportunities());
        testingPage.openPage().goToCategory("Менеджмент");
        Thread.sleep(3000);
        browser.quit();
    }
}
