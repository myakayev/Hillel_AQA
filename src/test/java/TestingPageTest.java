import homework_12.TestingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestingPageTest {  // test suite

    @BeforeMethod // буде викоритовуватись перед кожним тестом
    public void setUp() {
        System.out.println("setUp before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("tearDown after method");
    }


    @Test
    public void searchLogicTest() {
        // local variable - input data + expected result
        int expectedResult = 2;

        //business logic  -  steps
        WebDriver driver  = new ChromeDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit)); // це замість quit. буде завжди браузер закриватись, не залежно від результат у

        driver.manage().window().maximize();
        TestingPage testingPage = new TestingPage(driver);
        int actual = testingPage.openPage().getAdditionalCourses().size();

        //return  - assert
        //assert expectedResult == actual;
        Assert.assertEquals(actual, expectedResult);
    }


}
