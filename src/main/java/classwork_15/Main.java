package classwork_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(Duration.ofMillis(1)); //неявні очікування
        browser.get("https://ithillel.ua/");
        System.out.println(browser.getTitle());

        WebElement contactButton = browser.findElement(By.cssSelector("*.site-nav-link[href*='contact']"));
        String a = "as\"asd\"d";
        contactButton.click();
        System.out.println(browser.getTitle());

        Thread.sleep(3000);
        browser.quit();
    }
}
