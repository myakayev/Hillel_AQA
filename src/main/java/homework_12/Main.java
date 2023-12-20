package homework_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        TestingPage testingPage = new TestingPage(browser);
        System.out.println(testingPage.openPage().getCourses());
        //List<String> list = testingPage.getCourses();
        testingPage.openPage().getCourses();
        browser.quit();
    }
}
