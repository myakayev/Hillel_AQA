import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.*;

public class AnnotationTest {

    @BeforeSuite
    public void preConditionBeforeSuite(){
        System.out.println("preConditionBeforeSuite");
        System.getenv().forEach((key, value) -> System.out.println("key " + key + " value " + value));
        System.out.println(System.getenv("browser"));
    }

    @BeforeMethod
    public void preConditionBeforeEachTest(){
        System.out.println("preConditionBeforeEachTest");
    }

    @Test
    @Description("Allure escription section for test")
    @Severity(SeverityLevel.BLOCKER)
    public void firstTest(){
        System.out.println("First test");
    }

    @Test(enabled = false)
    public void secondTest(){
        System.out.println("Second test");
    }

    @Test
    public void thirdTest(){
        System.out.println("Third test");
    }

    @AfterMethod
    public void postConditionAfterEachTest(){
        System.out.println("postConditionAfterEachTest");
    }

    @AfterSuite
    public void postConditionAfterSuite(){
        System.out.println("postConditionAfterSuite");
    }
}
