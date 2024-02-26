import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources", plugin = {"pretty"})
public class TestCucumberTestBridge extends AbstractTestNGCucumberTests {
}
