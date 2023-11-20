package classwork_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.get("https://lms.ithillel.ua/");
        System.out.println(browser.getTitle());
        Thread.sleep(3000);
        browser.quit();
    }
}
