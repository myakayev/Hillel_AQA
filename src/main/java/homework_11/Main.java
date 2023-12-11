package homework_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(Duration.ofMillis(1)); //неявні очікування
        browser.get("https://ithillel.ua/");
        WebElement courseButton = browser.findElement(By.cssSelector("button.site-nav-link[data-dropdown-trigger*='coursesMenu']"));
        // WebElement courseButton = browser.findElement(By.xpath("//button[@data-dropdown-trigger = 'coursesMenu']"));
        // WebElement contactButton3 = browser.findElement(By.xpath("//button[contains(@data-dropdown-trigger, 'ursesMenu')]"));
        courseButton.click();
        browser.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        WebElement programmingButton = browser.findElement(By.xpath("//*[@id='coursesMenuControlPanel']/ul/li[2]/button"));
        // WebElement programmingButton = browser.findElement(By.xpath("//button[@class='cats-list_btn -active' and @data-category='programming']"));
        programmingButton.click();
        WebElement frontEndBasicButton = browser.findElement(
                By.xpath("//*[@id='block-202987']/div/ul/li[1]/a"));
        frontEndBasicButton.click();

        //*[@id="block-202987"]/div/ul/li[1]/a/div/p

        //browser.quit();
    }
}
