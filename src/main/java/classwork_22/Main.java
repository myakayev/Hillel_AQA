package classwork_22;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       // Configuration.browser = "firefox";
        Configuration.timeout = 10;
        //Configuration.baseUrl = "https://ithillel.ua/";
        Selenide.open("/courses/programming"); // буде додаваитись до базової урли
        // Selenide.open("https://ithillel.ua/"); // так відкривається, якщо baseUrl не вказано
        System.out.println(Selenide.title());
        Thread.sleep(3000);
        SelenideElement selenideElement =Selenide.$("");

        Selenide.closeWebDriver();
    }
}
