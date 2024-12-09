package classwork_17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new ChromeDriver();
        MainHillelPage mainPage = new MainHillelPage(browser);
        mainPage.openMainPage();
        mainPage.clickToBlogButton();
        Thread.sleep(3000);
        browser.quit();
    }
}
