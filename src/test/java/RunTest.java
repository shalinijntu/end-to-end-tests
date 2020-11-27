import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
    glue = {"hooks", "stepdefinitions"},
    tags = ("@Login"),
    plugin = {"pretty","json:target/cucumber.json"}
)
    public class RunTest
    {
    }

