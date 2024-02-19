import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SmokeCucumberTest {
    @Given("First given \\(pre-condition)")
    public void first_given_pre_condition() {
        System.out.println("Pre-condition");
      //  throw new io.cucumber.java.PendingException();
    }
    @Given("Second given")
    public void second_given() {
        System.out.println("Second Pre-condition");
    }

    @When("First test")
    public void first_test() {
        System.out.println("test");
    }
    @Then("Assert result")
    public void assert_result() {
        System.out.println("Assert result");
    }

}
