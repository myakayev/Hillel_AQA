package homework_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {

    public static void main(String[] args) {
        // Шлях до веб-драйвера Chrome (переконайтеся, що у вас встановлений веб-драйвер)
        // System.setProperty("webdriver.chrome.driver", "шлях_до_вашого_веб_драйвера/chromedriver");

        // Створення екземпляру веб-драйвера (використовуємо Chrome)
        WebDriver driver = new ChromeDriver();

        // Відкриття веб-сайту
        driver.get("https://www.example.com");

        // Знаходження елемента за CSS-селектором і введення тексту
        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.sendKeys("Hello, Selenium!");

        // Натискання на клавішу Enter
        searchBox.sendKeys(Keys.RETURN);

        // Очікування 5 секунд для того, щоб результати мали час завантажитися
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Виведення заголовка сторінки
        System.out.println("Page title: " + driver.getTitle());

        // Закриття веб-браузера
        driver.quit();
    }
}

