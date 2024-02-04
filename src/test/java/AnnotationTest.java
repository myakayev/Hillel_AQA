import org.testng.annotations.*;

public class AnnotationTest {

    @BeforeSuite
    public void preConditionBeforeSuite(){
        System.out.println("preConditionBeforeSuite");
    }

    @BeforeMethod
    public void preConditionBeforeEachTest(){
        System.out.println("preConditionBeforeEachTest");
    }

    @Test
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
